//Write a recursive method in Java that computes the factorial of a given integer.

import java.util.Scanner;
public class Q7 {
    static int calcFact(int f){
        if (f==0){
            return 1;
        }
        else {
            return (f*calcFact(f-1));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int fact= sc.nextInt();
        System.out.println("Factorial of "+fact+" is "+calcFact(fact));
    }
}
        
