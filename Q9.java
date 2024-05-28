//Write a recursive method in Java which, given an integer n, print it with its digits reversed.For example , given 4735, it prints 5374.

import java.util.Scanner;
public class Q9 {
    static int reverseDigit(int n){
        if (n<10){
            return n;
        }
        System.out.print(n%10);
        return reverseDigit(n/10);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        System.out.print("Reversed number is: ");
        System.out.println(reverseDigit(n));
    }
}
