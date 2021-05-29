package day48_constructors_static;

public class CustomerObjects {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1.toString());//print with default values that are set in no-args constructor
        System.out.println(cs1);//same thing with toString
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        //with Constructor: help you initialize and can do just one line
        Customer cs2 = new Customer("Mike", 2); //created object and assign values in the same statement
        Customer cs3 = new Customer("Faith", 4873);
        System.out.println(cs2);
        System.out.println(cs3);

    }
}
