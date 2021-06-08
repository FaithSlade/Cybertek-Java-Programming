package day50_inheritance;

public class Person {
    String name;
    int age;

    public void walk(){
        System.out.println("Person is walking");
    }
    public void talk(){
        System.out.println("Person is talking.");
    }
    public void work(String job){
        System.out.println("Person is working as " + job);
    }
}
