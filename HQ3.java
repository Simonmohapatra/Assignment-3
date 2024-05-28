//Write a recursive method in Java to find the binary equivalent of a positive decimal integer.

import java.util.Scanner;
public class HQ3 {
    static String decimalToBinary(int b){
        if (b==0){
            return "0";
        } else if (b==1) {
            return "1";
        }else {
            return decimalToBinary(b/2)+ String.valueOf(b%2);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int dec= sc.nextInt();
        String binary= decimalToBinary(dec);
        System.out.println(dec+" in binary is "+binary);
    }
}
