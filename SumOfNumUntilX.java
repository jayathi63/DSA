import java.util.Scanner;
public class SumOfNumUntilX {
    public static void main(String[] args)
    {
       
        Scanner input=new Scanner(System.in);
        int sum=0;
        String s2="x";
        System.out.print("Enter a value:");
        String s1=input.next();
        while(s2.equals(s1)!=true)
        {
            int x=Integer.parseInt(s1);
            sum+=x;
            System.out.print("Enter a value:");
            s1=input.next();
        }
        input.close();
        System.out.println("Sum="+sum);

    }
}
