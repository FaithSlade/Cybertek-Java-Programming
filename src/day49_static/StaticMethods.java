package day49_static;

public class StaticMethods {

    int num = 10;//non static variable it instance variable
    static int count = 5;//count is static variable

    public static void displayMessage(String message){ //static method with the class name
        System.out.println("message: " + message);
        System.out.println("count: " + count); //static can use and call like this
        //System.out.println(num); ERROR num is instance variable static cannot access
    }

    public static void anotherStaticMethod(){
        System.out.println("another static method");
        displayMessage("wooden spoon");
    }
    //StaticMethods.instanceMethod(); -> no
    //StaticMethods stm = new instanceMethod();
    //StaticMethods.instanceMethod();
    public void instanceMethod(){ //we have to create the object before use this method
        System.out.println("instanceMethod");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        displayMessage("hello from instance method");
    }
}
