package ConditionLoop;
import java.util.*;

public class rhombusArea {

    float d1;
    float d2;

    public static void main(String[] args) {
        
        rhombusArea rArea = new rhombusArea();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of diagnols of Rhombus:");
        rArea.d1 = input.nextFloat();
        rArea.d2 = input.nextFloat();
        if(rArea.d1 <=0 && rArea.d2<=0)
            System.out.println("Length of diagnols cannot be zero or negative");
        else
            System.out.println("Area of Rhombus = "+((rArea.d1*rArea.d2)/2));
        input.close();

    }
}
