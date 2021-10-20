package ConditionLoop;
import java.util.*;

public class parallelogramPerm{
    
    float l;
    float b;
    public static void main(String[] args) {

        parallelogramPerm pPerm = new parallelogramPerm();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of Paralellogram:");
        pPerm.l= input.nextFloat();
        System.out.print("Enter breadth of Paralellogram:");
        pPerm.b= input.nextFloat();
        if(pPerm.l<=0 || pPerm.b<=0)
            System.out.println("length and breadth cannot be zero or negative");
        else
            System.out.println("Perimeter of paralellogram = "+(2*(pPerm.l+pPerm.b)));
        input.close();
            
        }
        
    
}
