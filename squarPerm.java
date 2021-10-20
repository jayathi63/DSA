package ConditionLoop;
import java.util.*;

public class squarPerm{

    float s;
    public static void main(String[] args) {
       
        squarPerm sPerm = new squarPerm();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of side of  square:");
        sPerm.s = input.nextFloat();
        if(sPerm.s<=0)
            System.out.println("length of side of Square cannot be zero or negative");
        else
            System.out.println("Perimeter of Square = "+(4*sPerm.s));
        input.close();
    }
    
}
