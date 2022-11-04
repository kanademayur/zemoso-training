package Java.Assignment;

public class Assignment2 {
    public static void main(String[] args){
        checkStringContents();
    }
    public static void checkStringContents()
    {
        String a = "MayurKanade1";
        boolean b = a.matches("[a-zA-Z]+");
        System.out.println(a);
        System.out.println("String Contains only Alphabets :-"+b);


        }
    }


