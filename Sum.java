import java.util.Scanner;

public class Sum {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 'a' value : ");
        int a = input.nextInt();
        System.out.print("\nEnter 'b' value : ");
        int b = input.nextInt();
        System.out.println("\nSum of a,b = "+(a+b));
        input.close();
    }
}
