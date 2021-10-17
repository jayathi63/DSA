package firstJava;
import java.util.*;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class simpleInterest {
    int p;
    int t;
    int r;
    public static void main(String[] args)
    {
        simpleInterest si = new simpleInterest();
        Scanner input= new Scanner(System.in);
        System.out.print("Enter principal,time and Rate and interest:");
        si.p = input.nextInt();
        si.t = input.nextInt();
        si.r = input.nextInt();
        System.out.println("Simple Interest="+(si.p*si.t*si.r)/100);
        input.close();
    }
}
