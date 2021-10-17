package firstJava;
import java.util.*;

// Input currency in rupees and output in USD. 1 dollar = 75 rupees

public class rpsToDol {
    float rupee; 
    public static void main(String[] args)
    {
        rpsToDol rToDol = new rpsToDol();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rupees:");
        rToDol.rupee = input.nextFloat();
        System.out.println(rToDol.rupee +" rupees = "+((rToDol.rupee)/75.0)+" dollars");
        input.close();
    }
    
}
