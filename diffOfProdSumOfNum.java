package ConditionLoop;

import java.util.Scanner;

public class diffOfProdSumOfNum {

    int num;
    int product=1;
    int sum;
    public static void main(String[] args) {
        diffOfProdSumOfNum dNum = new diffOfProdSumOfNum();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        dNum.num = input.nextInt();
        int n = dNum.num; 
        while(n!=0)
        {
            dNum.product *= (n%10);
            dNum.sum +=(n%10);
            n=n/10;
        }
        if(dNum.num==0)
            System.out.println("difference of product and sum of digits of integer = "+0);
        else
            System.out.println("difference of product and sum of digits of integer = "+(dNum.product-dNum.sum));
        input.close();
    }
    
}
