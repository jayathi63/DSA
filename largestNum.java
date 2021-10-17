package firstJava;
import java.util.*;
//Take 2 numbers as input and print the largest number.
public class largestNum {
    int a;
    int b;
    
    public static void main(String[] args)
    {
        largestNum lNum = new largestNum();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b values:");
        lNum.a= input.nextInt();
        lNum.b=input.nextInt();
        if(lNum.a>lNum.b)
            System.out.println(lNum.a+ " is largest");
        else
            System.out.println(lNum.b+ " is largest");
        input.close();
    }
    
}
