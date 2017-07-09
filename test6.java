import java.util.Scanner;

public class NewClass {
    public static void main(String []args)
    {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       
       if(a%4==0 && a%100 != 0)
       {
        System.out.println("It is a Leap Year");   
       }
       else
       {
        System.out.println("It is not a Leap Year") ;  
       }
      
        }
}
