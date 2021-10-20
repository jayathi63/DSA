package ConditionLoop;
import java.util.*;

public class largeOfAll{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers(after all numbers enter 0):");
        int i=input.nextInt();
        int large=i;
        while(i!=0)
        {   
            i=input.nextInt();
            if(large<i)
                large=i;
        }
        System.out.println("Largest of all numbers="+large);
        input.close();
    }
    
}
