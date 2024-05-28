//Write a recursive method in Java to return the greatest common divisor(gcd) of two integers m
//and n, given that in general, gcd(m,n)=gcd(n, m mod n).

import java.util.Scanner;
public class HQ1 {
    static int calcGCD(int x, int y) {
        if (y==0){
            return x;
        }else{
            return calcGCD(x, x%y);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println("GCD of "+x+" and "+y+" is "+calcGCD(x,y));
    }
}
