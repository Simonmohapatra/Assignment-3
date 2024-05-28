//Write a recursive Java method that takes a character string s and outputs its reverse. For example, the reverse of 'pots&pans' would be 'snap&stop'.

import java.util.Scanner;
public class HQ5 {
    static String reverseString(String str){
        if (str.isEmpty() || str.length()<=1){
            return str;
        }
        return reverseString(str.substring(1))+str.charAt(0);
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str =sc.nextLine();
        System.out.println(reverseString(str));
    }
}
