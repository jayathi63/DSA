package ConditionLoop;
import java.util.*;

public class sumUntilZero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers(after all numbers enter 0):");
        int i=input.nextInt();
        int sum=0;
        while(i!=0)
        {
            sum+=i;
            i=input.nextInt();
        }
        System.out.println("Sum = "+sum);
        input.close();
    }
    
}
