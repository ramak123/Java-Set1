import java.util.Scanner;

public class NewClass {
    public static void main(String []args)
    {
       Scanner sc = new Scanner(System.in);
       char a = sc.next(".").charAt(0);
       if((int)a>64 & (int)a <91 || (int)a>96 & (int)a <123 )
       {
        System.out.println("The given Character is an Alphabet");   
       }
       else
       {
        System.out.println("The number is not an alphabet");   
       }
}
}
