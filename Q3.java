/*
Create a class Student & enter mark, name of the student. 
If mark is more than 100, create exception MarksOutOfBoundException & throw it using Java.
*/

import java.util.Scanner;
class MarksOutOfBoundException extends Exception{
    public String MarksOutOfBoundException(String message){
       return message;
    }
}
class Student{
    String name;
    int mark;
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Marks: "+mark);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Student s1= new Student();
        System.out.println("Enter the name of the student1: ");
        s1.name=sc.nextLine();
        System.out.println("Enter the marks of the student1: ");
        try {
            s1.mark=sc.nextInt();
            if (s1.mark>100){
                throw new MarksOutOfBoundException();
            }
            s1.display();
        }
        catch (MarksOutOfBoundException e){
            System.out.println(e+" Marks can't be greater than 100");
        }
    }
}
