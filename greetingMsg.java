package firstJava;
import java.util.*;

public class greetingMsg {
    String name;
    public static void main(String[] args)
    {
        greetingMsg gm = new greetingMsg();
        System.out.print("Enter your name:");
        Scanner input=new Scanner(System.in);
        gm.name= input.next();
        System.out.println("Hello, "+gm.name+" welcome to coding world!");
        input.close();
    }
}
