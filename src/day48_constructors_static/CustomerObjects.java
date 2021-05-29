package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        //array of Customers
        Customer[] todaysCustomers = {cs1, cs2, cs3, new Customer("Bashir", 449)};

        //arrayList of Customers object
        List<Customer> CustomerList = new ArrayList<>();//<> you can put anything in here like <Customer>
        CustomerList.add(cs1);
        CustomerList.add(cs2);
        CustomerList.add(cs3);
        CustomerList.add(new Customer("Bashir", 449));
        CustomerList.add(new Customer("Derek", 9763));
        CustomerList.add(new Customer("Nidnoi", 8907));
        CustomerList.add(new Customer("Foam", 5476));

        //Print info of first customer object in arrays and arraylist.
        System.out.println(todaysCustomers[0].toString());//Customer{name='Bob', id=1}
        System.out.println(todaysCustomers[0]);//Customer{name='Bob', id=1}
    }
}
