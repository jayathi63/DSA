package ConditionLoop;
import java.util.*;
public class triangleArea{

    float a;
    float b;
    float c;
    public static void main(String[] args) {

        triangleArea tArea = new triangleArea();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of all sides of triangle(a,b,c):");
        tArea.a= input.nextInt();
        tArea.b= input.nextInt();
        tArea.c= input.nextInt();
        float s=(tArea.a+tArea.b+tArea.c)/2;System.out.println(s);
        System.out.println("Area of circle = "+Math.sqrt(s*(s-tArea.a)*(s-tArea.b)*(s-tArea.c)));
        input.close();
    }
    
}
