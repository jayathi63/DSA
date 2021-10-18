package firstJava;
import java.util.Scanner;

public class fibonacci {
    
    int n;
    public static void main(String[] args)
    {
        fibonacci fb = new fibonacci();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n value:");
        fb.n= input.nextInt();
        int i=2;
        int a=0;
        int b=1;
        int c;
        if(fb.n>=1)
            System.out.print(a+",");
        if(fb.n>=2)
            System.out.print(b+",");
        while(i<fb.n)
        {
            c=a+b;System.out.print(c+",");
            a=b;
            b=c;
            i++;   
        }
        System.out.print("\n");
        if(fb.n<=0)
            System.out.println("Invalid input");
        input.close();
    }
}
