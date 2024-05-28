//Write a recursive method in Java to find the product of 2 numbers.

import java.util.Scanner;
public class HQ4 {
    static int product(int a, int b){
        if(a==0 || b==0){
            return 0;
        }
        else{
            return a+ product(a,b-1);
        }
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Product of two numbers: "+product(a,b));
    }
}
