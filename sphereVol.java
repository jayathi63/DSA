package ConditionLoop;

import java.util.Scanner;

public class sphereVol {

    float r;
    public static void main(String[] args) {
        
        sphereVol sVol = new sphereVol();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of sphere:");
        sVol.r =  input.nextFloat();
        System.out.println("volume of sphere = "+(4/3.0)*(22/7.0)*sVol.r*sVol.r*sVol.r);
        input.close();
    }
    
}
