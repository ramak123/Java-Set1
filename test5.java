import java.util.Scanner;

public class test5{
    public static void main(String []args)
    {
       int a,b,c;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter First Number");
       a = sc.nextInt();
        System.out.println("Enter Second Number");
       b = sc.nextInt();
        System.out.println("Enter Third Number");
        c = sc.nextInt();
        
        if(a>b)
        {
            if(a>c){
                System.out.println("A is the Greatest");
            }
            }

        if(b>c)
        {
            if(b>a){
                System.out.println("B is the Greatest");
            }
            }
       
        if(c>a)
        {
            if(c>b){
                System.out.println("C is the Greatest");
            }
            }
        }
}
