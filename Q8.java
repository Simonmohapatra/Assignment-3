//Write a recursive method in Java which, given real value x and a positive integer n, returns the value of x to the power n.

import java.util.Scanner;
public class Q8 {
    static int calcPower(int x, int n){
        if (n==0){
            return 1;
        }
        else {
            return x*calcPower(x,n-1);
        }
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X and N: ");
        int X= sc.nextInt();
        int N= sc.nextInt();
        System.out.println("X^N = "+calcPower(X,N));
    }
}
