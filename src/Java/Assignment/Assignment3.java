package Java.Assignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) throws ParseException {
        System.out.println("Enter the Numbers Of Inputs: ");
        Scanner sc= new Scanner(System.in);
        int noOfInputs=sc.nextInt();
        System.out.println("Enter the "+noOfInputs+" sets of date to check for: ");
        System.out.println("Enter the date in dd-MM-yyyy format");
        String data[][]=new String[noOfInputs][2];
        String signupDate=null;
        String currentDate=null;

        for (int i=0;i<noOfInputs;i++)
        {
            signupDate=sc.next();
            currentDate=sc.next();
            data[i][0]=signupDate;
            data[i][1]=currentDate;
        }
        System.out.println("Output");
        for (int i=0;i<noOfInputs;i++)
        {
            try {
                if (checkValidity(data[i][0]) && checkValidity(data[i][1]))
                {
                    getDateRange(data[i][0],data[i][1]);
                }
            }
            catch (Exception e)
            {
                System.out.println("Invalid Date !");
            }
        }
        sc.close();


    }

    private static boolean checkValidity(String date) {
        boolean isvalid = false;
        if (date.length() == 10) {
            isvalid = true;
        }
        return isvalid;
    }

    static int getDateRange(String signup, String current) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        format.setLenient(false);
        Date signupDate = null, currentDate = null;
        try {
            signupDate = format.parse(signup);
            currentDate = format.parse(current);
        } catch (ParseException e) {
            System.out.println("Date Is Invalid, Please Enter the date in dd-MM-yyyy format only");
            return 0;
        }
        if (signupDate.after(currentDate)) {
            System.out.println("No Range");
        } else {
            Calendar calsignup = Calendar.getInstance();
            calsignup.setTime(signupDate);

            Calendar calCurrent = Calendar.getInstance();
            calCurrent.setTime(currentDate);
            //To get the period
            //Substract the current date from signup date
            int years = calCurrent.get(Calendar.YEAR) - calsignup.get(Calendar.YEAR);
            calsignup.add(Calendar.YEAR, years);
            calsignup.add(Calendar.DAY_OF_MONTH, -30);
            System.out.print(format.format(calsignup.getTime()) + " ");
            calsignup.add(Calendar.DAY_OF_MONTH, 60);

            if (calsignup.before(calCurrent)) {
                System.out.println(format.format(calsignup.getTime()));
            } else {
                System.out.println(format.format(calCurrent.getTime()));
            }
        }
        return 0;
    }
}
















