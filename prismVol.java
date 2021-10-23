package ConditionLoop;

import java.util.Scanner;

public class prismVol {

    float h;
    public static void main(String[] args) {
        
        prismVol pVol = new prismVol();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height of Prism:");
        pVol.h = input.nextFloat();
        System.out.print("Enter your choice of base(Enter 1 if base of prism is rectangle):\n1.Rectangle\n2.Square\n3.triangle\n");
        int i= input.nextInt();
        switch(i)
        {
            case 1: System.out.println("volume of Rectangular prism = "+rectArea.main(args)*pVol.h);
                    break;
            case 2: System.out.println("volume of Square prism = "+squareArea.main(args)*pVol.h);
                    break;
            case 3: System.out.println("volume of Triangular prism = "+triangleArea.main(args)*pVol.h);
                    break;
            default: System.out.println("Invalid choice");
        }
        input.close();

    }
    
}
