import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args)
    {
        int num;
        System.out.print("Enter a number:");
        Scanner input=new Scanner(System.in);
        num=input.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" X "+i+" = "+(num*i));
        }
        input.close();
    }

}
