import java.util.Scanner;
public class HCFandLCM {
    static int HCF(int a,int b)
    {
        
        int val=a%b;
        if(val==0)
            return b;
        else
        {
            while(val>=0)
            {
                a=b;
                b=val;
                val=a%b;
                if(val==0)
                {
                    val=b;
                    break;
                }

            }
        }
        return val;
    }
    public static void main(String[] args)
    {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 'a' value:");
        a=input.nextInt();
        System.out.print("Enter 'b' value:");
        b=input.nextInt();
        if(b>a)
        {
            int temp=a;
            a=b;
            b=temp;
        }
        int hcf=HCF(a,b);
        System.out.println("HCF of a,b = "+hcf);
        int lcm = (a*b)/hcf;
        System.out.println("LCM of a,b = "+lcm);
        input.close();
    }
    
}
