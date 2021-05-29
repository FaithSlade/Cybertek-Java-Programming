package day47_constructors;

public class String {
    private java.lang.String name;
    private int age;
    //    //No_args constructor
    public String() {
        System.out.println("No-Args constructor");
    }

    //constructor overloading with 1 param: String name
    public String(java.lang.String name) {
        System.out.println("name param constructor | name = " + name);
    }

    //constructor with age
    public String(int age) {
        System.out.println("age param constructor | age = " + age);
    }
    //constructor with name and age
    public String(java.lang.String name, int age) {
        System.out.println("name&age param constructor | " + name +"-"+age);
    }
}
