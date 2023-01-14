import java.util.Scanner;

public class Tobin {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);//creating scanner object
        int x = sc.nextInt(); //take decimal number 
        System.out.print(Convert.toBinary(x)); //call binary converter method and display value
    }
}

public class Convert{
    //public class for return string binary value 
    public static String toBinary(int x){
        String binary = "";//declare binary variable String
      
        //convertion of binary
        while(x>0){
            binary = (x % 2)+binary;
            x /= 2;
        }
        return binary;//return String value of binary 
    }
}
