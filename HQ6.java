/*
Write a recursive Java method that determines if a string s is a palindrome, that is, it is equal to its reverse. 
Examples of palindromes include 'racecar' and 'gohangasalamiimalasagnahog'.
*/

import java.util.Scanner;
public class HQ6 {
    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        } 
        else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str =sc.nextLine();
        System.out.println(str+" is Palindrome: "+isPalindrome(str));
    }
}
