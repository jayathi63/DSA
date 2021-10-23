package ConditionLoop;
import java.util.*;

public class coneVol
{
    float h;
    float r;

    public static void main(String[] args) {
        
        coneVol cv = new coneVol();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height of cone : ");
        cv.h=input.nextFloat();
        System.out.print("Enter radius of cone : ");
        cv.r = input.nextFloat();
        System.out.println("Volume of Cone = "+ ((22/7.0)*cv.r*cv.r*cv.h)/3);
        input.close();
    }
}