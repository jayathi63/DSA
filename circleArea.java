package ConditionLoop;
import java.util.*;
public class circleArea {

    float r;
    public static void main(String[] args) {

        circleArea cArea = new circleArea();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of Circle:");
        cArea.r= input.nextFloat();

        if(cArea.r<=0)
            System.out.println("Radius cannot be zero or negative");
        else
            System.out.println("Area of circle = "+(22/7.0)*cArea.r*cArea.r);
        input.close();
    }
    
}
