package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyPaste {
    static void main() {
        try {

            FileInputStream fis = new FileInputStream("images.jpeg");
            FileOutputStream fos = new FileOutputStream("images2.jpeg");

            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }

            fis.close();
            fos.close();
        } catch (Exception e) {
            System.out.println();
        }
    }
}
