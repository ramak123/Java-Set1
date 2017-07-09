import java.util.Scanner;

public class test3 {
    public static void main(String []args)
    {
        Scanner sc = new Scanner (System.in);
        char c = sc.next(".").charAt(0);
        System.out.println(c);
       
        if((int)c==97 || (int)c==101||(int)c==105||(int)c==111||(int)c==117
                ||(int)c==65||(int)c==69||(int)c==73||(int)c==79||(int)c==85)
        {
         System.out.println("It is a vowel") ;  
        }
        else
        {
         System.out.println("it is a consonant");   
        }
    }
}
