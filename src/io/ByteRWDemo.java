package io;

import java.io.*;

// WAP to read and write 8 bit and byte data from/to a file.
// Can copy text, audio, video.
// but use character write/read for text based file for .

public class ByteRWDemo {
    public static void readFile() throws Exception {
        FileInputStream fis = new FileInputStream("hello.txt");
        int c;

        while ((c = fis.read()) != -1) {
            System.out.print((char) c);
        }

        System.out.println();
        System.out.println("Complete....");
        fis.close();
    }

    public static void writeFile() throws Exception {
        FileOutputStream fos = new FileOutputStream("hello.txt");
        fos.write("Hello i am writing to a file".getBytes());
        System.out.println("Success...");
        fos.close();
    }

    static void main(String[] args) {
        try {
            writeFile();
            readFile();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
