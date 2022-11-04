package Java.Assignment;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment4 {

    public static void main (String[] args) {
        createFile();
        readFromFile();
        writeToFile();
        readFromFile();
        informationAboutFile();
    }

        public static void createFile() {
            File f = new File("//home//mayuk//Desktop//NewFile3.txt");
            try {

                if (f.createNewFile()) {
                    System.out.println("File Successful Created");
                } else {
                    System.out.println("File Already Exist...");
                }
            } catch (IOException i) {
                System.out.println("Exception Handled...");
            }
        }

        public static void writeToFile() {
            try {
                FileWriter f1 = new FileWriter("NewFile3.txt");
                try {
                    f1.write("Hello\n");
                    f1.write("Writing Into the file");
                }
                catch (IOException i) {
                    System.out.println(i);
                }
                finally {
                    f1.close();
                }
                System.out.println("Successfull Data Wrote in File");
            } catch (IOException i) {
                System.out.println(i);
            }
        }

        public static void readFromFile() {
            try {
                FileReader r = new FileReader("NewFile3.txt");
                try {
                    int a;
                    while ((a = r.read()) != -1) {
                        System.out.print((char) a);

                    }
                    System.out.println();
                } finally {
                    r.close();
                }
            } catch (IOException i) {
                System.out.println("Exception Handle..!");
            }
        }


        public static void informationAboutFile() {
            File f2 = new File("//home//mayuk//Desktop//NewFile3.txt");

            if (f2.exists()) {
                System.out.println("File Name : " + f2.getName());
                System.out.println("File Location: " + f2.getAbsoluteFile());
                System.out.println("File Writable: " + f2.canWrite());
                System.out.println("File Readable: " + f2.canRead());
                System.out.println("File Size: " + f2.length());
            } else {
                System.out.println("File doesn't Exists...");
            }
        }

    }

