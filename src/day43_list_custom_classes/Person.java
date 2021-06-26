package day43_list_custom_classes;
//firstName, age => template class
//we didn't declare the value, just variable name and data type for this class we called template
//1) class
public class Person {
    //Data -> variable
    String firstName;
    int age;
    char gender;
    //behaviour

    public void speak(){
        System.out.println("Person is speaking");
    }
}

//2) class
class people { // class for running with main method
    public static void main(String[] args) {
//      create object of Person class -or we called: Instantiate Person class
        Person person1 = new Person();// new is a keyword to create object
        person1.firstName = "Bob";//we have to called class first
        person1.age = 33;
        person1.gender = 'M';
        person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);
        //look like we create new chrome

        Person person2 = new Person();
        person2.firstName = "Mike";
        person2.age = 12;
        person2.gender = 'M';
        person2.speak();

        System.out.println(person2.firstName);//mike
        System.out.println(person2.age);//12
        System.out.println(person1.gender);
//      person2.email = "mike@gmail.com"; ERROR: email is not in Person class, we need to create it first at the template class

        System.out.println("person1.firstName" + person1);
    }


}
