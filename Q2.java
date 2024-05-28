/*
Assign your favorite colors in an array. 
Identify 2 exceptions that may be generated & write exceptional handler in Java.
*/

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] arr = new String[4];
        System.out.println("Enter four colours:");
        for (int i=0; i<4; i++){
            arr[i]=sc.nextLine();
        }
        try {
            System.out.println("Convert string to Integer");
            for (int i=0; i<4; i++){
                Integer.parseInt(arr[i]);
            }
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
        try {
            System.out.println("Enter one more colour: ");
            arr[5]=sc.nextLine();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("The colours entered are: ");
        for (int i=0; i<4; i++){
            System.out.println(arr[i]);
        }
    }
}
