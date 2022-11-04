package Java.Assignment;

public class Assignment1 {
    public static void main(String[] args){
        printNumbers();
    }

    public static void printNumbers()
    {
        System.out.println("Printing number 1 to 100 :");
        for(int no=1;no<=100;no++){
            if((no%3==0) && (no%5==0))
            {
                System.out.println("FizzBuzz");
            }
            else if(no%3==0)
            {
                System.out.println("Fizz");
            }
            else if(no%5==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(no);
            }
        }
    }
}
