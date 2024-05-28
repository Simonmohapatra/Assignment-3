/*
Write a java program to print an array of different type using a single Generic method. 
The signature of printArray method is given below.
public static < E > void printArray( E[] inputArray)
*/

import java.util.Scanner;
public class Q5 {
    public static <E> void printArray(E [] inputArray){
        for (int i=0; i<inputArray.length; i++){
            System.out.print(inputArray[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of elements in array: ");
        int n= sc.nextInt();

        //Integer array
        Integer[] intArray = new Integer[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++){
            intArray[i]= sc.nextInt();
        }
        System.out.println("\nInteger Array contains: ");
        printArray(intArray);

        //Double array
        Double[] doubleArray = new Double[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++){
            doubleArray[i]= sc.nextDouble();
        }
        System.out.println("\nDouble Array contains: ");
        printArray(doubleArray);

        //Character array
        Character[] charArray = new Character[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++){
            charArray[i]= sc.next().charAt(0);
        }
        System.out.println("\nCharacter Array contains: ");
        printArray(charArray);
    }
}
