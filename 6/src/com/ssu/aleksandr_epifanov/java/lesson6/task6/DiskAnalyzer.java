package com.ssu.aleksandr_epifanov.java.lesson6.task6;

import java.io.*;
import java.math.BigInteger;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class DiskAnalyzer {
    public static int number;
    public static BigInteger sum = BigInteger.ZERO;
    public static long counter = 0;
    public static void main(String[] args) throws IOException {
        DiskAnalyzer diskAnalyzer = new DiskAnalyzer();
        diskAnalyzer.startApp();
    }
    public void startApp() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь");
        Path path = Path.of(scanner.next()); // /Users/alex/PycharmProjects
        System.out.println("Введите номер функции");
        number = scanner.nextInt();
        if (number > 4 | number < 1){
            System.out.println("Неверный номер функции");
        }
        if (!Files.exists(path)){
            System.out.println("Неверный путь");
            return;
        }
        ArrayList<Path> paths = new ArrayList<>();
        Map<Path, Long> pathLongMap = new HashMap<>();
        Map<Character, Long> files = new HashMap<>();
        Map<Character, Long> folders = new HashMap<>();
        char c;
        for(c = 'A'; c <= 'Z'; ++c) {
            files.put(c, 0L);
            folders.put(c, 0L);
        }
        paths.add(path);
        Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path curPath, BasicFileAttributes attrs) throws IOException {
                switch (DiskAnalyzer.number) {
                    case 1: {
                        if (curPath.toString().chars().filter(c -> c == 's').count()
                                > paths.get(paths.size() - 1).toString().chars().filter(c -> c == 's').count()) {
                            paths.add(curPath);
                        }
                        break;
                    }
                    case 2:{
                        if (pathLongMap.size() < 5) pathLongMap.put(curPath, Files.size(curPath));
                        else {
                            Path pathToReplace = null;
                            for (Map.Entry<Path, Long> entry: pathLongMap.entrySet()){
                                if (Files.size(curPath) > entry.getValue()){
                                    if (pathToReplace == null){
                                        pathToReplace = entry.getKey();
                                    } else {
                                        if (Files.size(pathToReplace) > entry.getValue()){
                                            pathToReplace = entry.getKey();
                                        }
                                    }
                                }
                            }
                            if (pathToReplace != null) {
                                pathLongMap.remove(pathToReplace);
                                pathLongMap.put(curPath, Files.size(curPath));
                            }
                        }
                        break;
                    }
                    case 3:{
                        sum = sum.add(BigInteger.valueOf(Files.size(curPath)));
                        counter += 1;
                    break;}
                    case 4:{
                        int idx = curPath.toString().lastIndexOf("/");
                        char c = curPath.toString().charAt(idx + 1);
                        File curFile = new File(curPath.toString());
                        if (!curFile.isDirectory()) {
                            if (files.containsKey(c)) {
                                long count = files.get(c) + 1;
                                files.replace(c, count);
                            }
                        }
                        else {
                            if (folders.containsKey(c)) {
                                long count = folders.get(c) + 1;
                                folders.replace(c, count);
                            }
                        }
                    }
                }
                return FileVisitResult.CONTINUE;
            }
        });

        PrintWriter answer = new PrintWriter("answer.txt");
        switch (number){
            case 1:{
                answer.write(paths.get(paths.size() - 1).toString());
            }
            case 2:{
                answer.write(pathLongMap.toString());
            }
            case 3:{
                answer.write(sum.divide(BigInteger.valueOf(counter)).toString());
            }
            case 4:{
                Object[] filesArray = files.values().toArray();
                Object[] folderArray = folders.values().toArray();
                int index = 0;
                for(c = 'A'; c <= 'Z'; ++c) {
                    answer.write(c + ": Folders - " + folderArray[index] + " Files - " + filesArray[index]);
                    index++;
                }
            }
        }
        answer.flush();
        answer.close();
    }
}
