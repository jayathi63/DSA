package ConditionLoop;
import java.util.*;

public class cylVol
{
    float h;
    float r;

    public static void main(String[] args) {
        
        cylVol cv = new cylVol();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height of Cylinder : ");
        cv.h=input.nextFloat();
        System.out.print("Enter radius of Cylinder : ");
        cv.r = input.nextFloat();
        System.out.println("Volume of Cylinder = "+ ((22/7.0)*cv.r*cv.r*cv.h));
        input.close();
    }
}