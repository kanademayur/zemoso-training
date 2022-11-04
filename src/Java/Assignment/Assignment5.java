package Java.Assignment;

import java.io.File;
import java.util.Scanner;

public class Assignment5 {
    public static void main (String[] args){
        directory();
    }
    public static void directory ()
    {

//Address of home directory
        File dir = new File("//home//mayuk//Desktop");
        String str;
        String abc="1";
        Scanner sc = new Scanner(System.in);
        do {
            int i=0;
            System.out.println("Enter the name of file ");
            str= sc.nextLine();
            String[] files = dir.list();
            for (String s : files)
            {
                //Boolean str1=str.equals(s);
                if (str.equals(s))
                {
                    i=1;
                    System.out.println("File Found : ");
                    System.out.println(s);
                    System.out.println("File Path :"+ dir.getAbsolutePath());

                }


            }
            if (i==0)
            {
                System.out.println("File Not Found : Re-Enter the file name.");
            }
            if (str.equals(abc))
            {
                sc.close();
            }

        }
        while (true);



    }
}
