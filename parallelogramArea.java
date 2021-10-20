package ConditionLoop;
import java.util.*;

public class parallelogramArea {

    float b;
    float h;
    public static void main(String[] args) {
        
        parallelogramArea pArea = new parallelogramArea();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base of parallelogram:");
        pArea.b= input.nextFloat();
        System.out.print("Enter height of parallelogram:");
        pArea.h= input.nextFloat();
        if(pArea.b<=0 || pArea.h<=0)
            System.out.println("base and height cannot be zero or negative");
        else
            System.out.println("Area of rectangle = "+(pArea.b*pArea.h));
        input.close();
            
    }
}
