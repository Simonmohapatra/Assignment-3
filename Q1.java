/*
Write a Java program to read your lucky number from keyboard. 
Treat –ve no. as NumberFormatException. 
Write appropriate Exceptional handler.
*/

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your lucky number: ");
        int a=sc.nextInt();
        try{
            if (a<0){
                throw new NumberFormatException("Negative number");
            }
            System.out.println("Your lucky number is "+a);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}
