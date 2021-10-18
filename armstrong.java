package firstJava;
import java.util.*;
public class armstrong {

    int x;
    public static void main(String[] args) {
        
        armstrong arms = new armstrong();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        arms.x=input.nextInt();
        int n= String.valueOf(arms.x).length();
        int temp= arms.x;
        int sum=0;
        while(temp>0)
        {
            
            int d = temp % 10;
            temp = temp / 10;
            sum += Math.pow(d,n);
        }System.out.println(sum);
        if(sum==arms.x)
            System.out.println(arms.x+" is an armstrong number");
        else
            System.out.println(arms.x+" is not an armstrong number");
        input.close();
    }
    
}
