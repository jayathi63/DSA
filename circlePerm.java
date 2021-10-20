package ConditionLoop;
import java.util.*;

public class circlePerm {

    float r;
    public static void main(String[] args) {
        
        circlePerm cPerm = new circlePerm();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        cPerm.r = input.nextFloat();
        if(cPerm.r<=0)
            System.out.println("Radius cannot be zero or negative");
        else
            System.out.println("Perimeter of circle = "+(22/7.0)*2*cPerm.r);
        input.close();
    }
    
}
