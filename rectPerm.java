package ConditionLoop;
import java.util.*;

public class rectPerm{
    
    float l;
    float b;
    public static void main(String[] args) {

        rectPerm rPerm = new rectPerm();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of rectangle:");
        rPerm.l= input.nextFloat();
        System.out.print("Enter breadth of rectangle:");
        rPerm.b= input.nextFloat();
        if(rPerm.l<=0 || rPerm.b<=0)
            System.out.println("length and breadth cannot be zero or negative");
        else
            System.out.println("Perimeter of rectangle = "+(2*(rPerm.l+rPerm.b)));
        input.close();
            
        }
        
    
}
