package com.company;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedFolders {
    public static void main(String[] args) {

        File file = new File("D:\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        Deque<File> deque = new ArrayDeque<>();
        deque.add(file);

        int counter = 0;
        while (!deque.isEmpty()){
            

            File f = deque.poll();
            counter++;
            System.out.println(f.getName());

            File[] files = f.listFiles();

            for (File innerFile : files){
                if (innerFile.isDirectory()){
                    deque.offer(innerFile);
                }
            }

        }
        System.out.printf("%d folders", counter);
    }
}