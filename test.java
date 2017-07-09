import java.util.Scanner;

public class test{

 
    public static void main(String[] args) {
       
       int a ;
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       if(a>0)
       {
       System.out.println("Number is positive");
       }
       else if(a==0)
       {
            System.out.println("Number is 0");
       }
       else if(a<0)
       {
           System.out.println("Number is negative");
           
       }
           
       
        
    }
    
}
