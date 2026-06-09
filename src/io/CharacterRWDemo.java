package io;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterRWDemo {
    public static void readFile() throws Exception {
        FileReader fis = new FileReader("hello.txt");
        int c;

        while((c = fis.read()) != -1) {
            System.out.print((char)c);
        }

        System.out.println();
        System.out.println("Complete....");
        fis.close();
    }

    public static void writeFile () throws Exception {
        FileWriter fos = new FileWriter("hello.txt");
        fos.write("Hello i am writing to a file 2");
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
