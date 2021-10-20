package ConditionLoop;

import java.util.Scanner;

public class factorsOfNum {

    int num;
    public static void main(String[] args) {
        factorsOfNum fNum = new factorsOfNum();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number:");
        fNum.num = input.nextInt();
        int i=1;
        System.out.print("Fators of "+fNum.num+" = ");
        while(i<fNum.num)
        {
            if(fNum.num % i == 0)
                System.out.print(i+",");
            i++;
        }
        input.close();
        System.out.println(fNum.num);
    }
}
