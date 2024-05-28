/*
Write a java method using Generics to count the occurrence of an element in an array of any type. 
The signature of count method is given below.
public static <T> int count(T[] array, T item)
*/

import java.util.Scanner;
public class Q6 {
    public static <T> int count(T[] array, T item){
        int count =0;
        for (int i =0; i< array.length; i++){
            if (array[i].equals(item)){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Integer arr[]=new Integer[5];
        System.out.println("Enter array elements: ");
        for (int i =0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int s= sc.nextInt();
        System.out.println("Number of times "+s+" present in the array is: "+count(arr,s));
    }
}
        
