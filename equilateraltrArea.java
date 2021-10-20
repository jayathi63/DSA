package ConditionLoop;
import java.util.*;

public class equilateraltrArea {

    Float a;

    public static void main(String[] args) {
        
        equilateraltrArea eArea = new equilateraltrArea();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of side of a Equilateral triangle(a):");
        eArea.a = input.nextFloat();
        if(eArea.a<=0)
            System.out.println("length cannot be zero or negative");
        else
            System.out.println("Area of Equilateral Triangle = "+ ((Math.sqrt(3)/4)*eArea.a*eArea.a));
        input.close();
    }
    
}
