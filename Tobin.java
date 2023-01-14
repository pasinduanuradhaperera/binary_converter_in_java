import java.util.Scanner;

//your code goes here


public class Tobin {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Convert.toBinary(x));
    }
}
public class Convert{
    public static String toBinary(int x){
        String binary = "";
        while(x>0){
            binary = (x % 2)+binary;
            x /= 2;
        }
        return binary;
    }
}
