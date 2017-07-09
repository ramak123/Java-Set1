import java.util.Scanner;

public class NewClass {
    public static void main(String []args)
    {
       int n;
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       
       int sum = 0;
       for(int i = 1; i<=n;i++)
       {
        sum = sum + i;   
       }
       System.out.println("The Sum of numbers is"+sum);
        }
}
