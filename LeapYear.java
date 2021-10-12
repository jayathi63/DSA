import java.util.Scanner; 

public class LeapYear
{
    public static int x;
    public static void main(String[] args)
    {
        System.out.print("Enter year:");
        Scanner input=new Scanner(System.in);
        x = input.nextInt();
        if(x%4==0)
            System.out.println(x+" is a leap year");        
        else
            System.out.println(x+" is not a leap year");  
        input.close(); 
    }
}