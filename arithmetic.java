package firstJava;
import java.util.*;

// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions
public class arithmetic {

    int a;
    int b;
    String operator;
    public static void main(String[] args) {

        arithmetic arth = new arithmetic();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b values:");
        arth.a= input.nextInt();
        arth.b=input.nextInt();
        System.out.print("Enter an arithmetic operator(+,-,x,/,%):");
        arth.operator=input.next();
        if(arth.operator.equals("+"))
            System.out.println(arth.a+" + "+arth.b+" = "+(arth.a+arth.b));
        else if(arth.operator.equals("-"))
            System.out.println(arth.a+" - "+arth.b+" = "+(arth.a-arth.b));
        else if(arth.operator.equals("x"))
            System.out.println(arth.a+" x "+arth.b+" = "+(arth.a*arth.b));
        else if(arth.operator.equals("/"))
            System.out.println(arth.a+" / "+arth.b+" = "+(arth.a/arth.b));
        else if(arth.operator.equals("%"))
            System.out.println(arth.a+" % "+arth.b+" = "+(arth.a%arth.b));
        else
            System.out.println("Invalid operator");
        input.close();
    }
}
