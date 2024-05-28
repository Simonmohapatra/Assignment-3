/*
The sequence of numbers 1, 1, 2, 3, 5, 8, 13 etc are called Fibonacci numbers,
each is the sum of the preceding two. Write a recursive method in Java which, 
given n, returns the nth Fibonacci number.
*/

import java.util.Scanner;
public class Q10 {
    static int Fib(int n){
        if (n<=1){
            return n;
        }
        return Fib(n-1)+Fib(n-2);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the term to be displayed: ");
        int n=sc.nextInt();
        System.out.println(Fib(n));
    }
}
