package ConditionLoop;

import java.util.Scanner;

public class pyramidVol {

    float h;
    public static void main(String[] args) {
        
        pyramidVol pVol = new pyramidVol();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height of pyramid : ");
        pVol.h = input.nextFloat();
        System.out.print("Enter your choice of base(Enter 1 if base of pyramid is rectangle):\n1.Rectangle\n2.Square\n3.triangle\n");
        int i= input.nextInt();
        switch(i)
        {
            case 1: System.out.println("volume of Rectangular pyramid = "+(1/3.0)*rectArea.main(args)*pVol.h);
                    break;
            case 2: System.out.println("volume of Square pyramid = "+(1/3.0)*squareArea.main(args)*pVol.h);
                    break;
            case 3: System.out.println("volume of Triangular pyramid = "+(1/3.0)*triangleArea.main(args)*pVol.h);
                    break;
            default: System.out.println("Invalid choice");
        }
        input.close();

    }
    
}
