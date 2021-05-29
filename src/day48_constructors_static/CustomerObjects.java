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
        System.out.println(CustomerList.get(0).toString());

        System.out.println(CustomerList);//print toSting() info of all Customer objects
        System.out.println("-----For Loop-----");
        for(int i = 0; i < CustomerList.size(); i++){
            System.out.println(CustomerList.get(i));
        }
        System.out.println("-----For Each Loop-----");
        for(Customer each : CustomerList){ // make sure it the same data type with List
            System.out.println(each);
        }

        //print only names of Customers in the list
        System.out.println("-----Names of the Customers-----");
        for (int i = 0; i < CustomerList.size(); i++) {
            System.out.println(CustomerList.get(i).getName());
        }
        //ForEach method and lambda expression
        for(Customer each : CustomerList){
            System.out.println(each.getName());// you cannot said just .name cause it private Encapsulation
        }
    }
}
