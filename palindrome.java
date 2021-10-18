package firstJava;

import java.util.*;
public class palindrome {
    StringBuffer x = new StringBuffer();
    public static void main(String[] args) {
        palindrome p = new palindrome();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input:");
        String temp = input.next();
        p.x.append(temp);
        StringBuffer tmpb= new StringBuffer();
        tmpb.append(temp);
        tmpb.reverse();
        if(tmpb.toString().equals(temp))
            System.out.println(p.x+" is palindrome");
        else
            System.out.println(p.x+" is not a palindrome");
        input.close();
    
    }
}
