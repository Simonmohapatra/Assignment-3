/*
Write a simple main class in Java that contains an experiment that uses the generic Box<T> class to build boxes with different types and that verifies that this class works as advertised.
Your experiment should include the following:
 Create a boxed String object and two variables that refer to that box. 
Change the contents of one and determine the effect on the other.
 Create a boxed Integer object and two variables that refer to that box. 
Change the contents of one and determine the effect on the other.
 Create a boxed Object object and two variables that refer to that box. 
Determine what happens if you put a string in the box. 
Determine what happens if you put an integer in the box.
*/  

class Box<T>{
    public T t;
    public Box(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Box<String> str1= new Box<>("It is the object of Box String");
        Box<String>str2=str1;
        System.out.println("Str1 contains: "+str1.get());
        System.out.println("Str2 contains: "+str2.get());
        str1.set("It is new string");
        System.out.println("String box contains: "+str1.get());
        System.out.println("String box2 contains: "+str2.get());

        Box<Integer> int1= new Box<>(10);
        Box<Integer> int2= int1;
        System.out.println("int1 contains: "+int1.get());
        System.out.println("int2 contains: "+int2.get());
        int1.set(20);
        System.out.println("Integer box contains: "+int1.get());
        System.out.println("Integer box2 contains: "+int2.get());

        Box<Object> obj1= new Box<>(new Object());
        Box<Object> obj2= obj1;
        System.out.println("obj1 contains: "+obj1.get());
        System.out.println("obj2 contains: "+obj2.get());
        obj1.set("Hello");
        System.out.println("Object box contains: "+obj1.get());
        System.out.println("Object box2 contains: "+obj2.get());
        obj1.set(10);
        System.out.println("Object box contains: "+obj1.get());
        System.out.println("Object box2 contains: "+obj2.get());
    }
}
        
