package ConditionLoop;
import java.util.*;

public class equilateraltrPerm{

    float s;
    public static void main(String[] args) {
       
        equilateraltrPerm tPerm = new equilateraltrPerm();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of side of triangle:");
        tPerm.s = input.nextFloat();
        if(tPerm.s<=0)
            System.out.println("length of side of triangle cannot be zero or negative");
        else
            System.out.println("Perimeter of Equalateral traingle = "+(3*tPerm.s));
        input.close();
    }
    
}
