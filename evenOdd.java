package firstJava;
import java.util.Scanner;
//Write a program to print whether a number is even or odd, also take input

public class evenOdd 
{
    int a;
    public static void main(String[] args)
    {
        evenOdd x=new evenOdd();
        System.out.print("Enter a number:");
        Scanner input = new Scanner(System.in);
        x.a =input.nextInt();
        if(x.a%2==0)
            System.out.println(x.a+" is an even number");
        else
            System.out.println(x.a+" is an odd number");
        input.close();
    }
}

