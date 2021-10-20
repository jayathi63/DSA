package ConditionLoop;
import java.util.*;

public class rhombusPerm{

    float s;
    public static void main(String[] args) {
       
        rhombusPerm  rPerm = new rhombusPerm();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of side of  Rhombus:");
        rPerm.s = input.nextFloat();
        if(rPerm.s<=0)
            System.out.println("length of side of Rhombus cannot be zero or negative");
        else
            System.out.println("Perimeter of Rhombus = "+(4*rPerm.s));
        input.close();
    }
    
}
