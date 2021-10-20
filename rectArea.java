package ConditionLoop;
import java.util.*;

public class rectArea {
    
    float l;
    float b;
    public static void main(String[] args) {

        rectArea rArea = new rectArea();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of rectangle:");
        rArea.l= input.nextFloat();
        System.out.print("Enter breadth of rectangle:");
        rArea.b= input.nextFloat();
        if(rArea.l<=0 || rArea.b<=0)
            System.out.println("length and breadth cannot be zero or negative");
        else
            System.out.println("Area of rectangle = "+(rArea.l*rArea.b));
        input.close();
            
        }
        
    
}
