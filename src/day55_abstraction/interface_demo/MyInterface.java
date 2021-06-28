package day55_abstraction.interface_demo;

public interface MyInterface {
/**interface keyword is used to create an interface in java.
 * we cannot create object
 * abstract interface class can store abstract method amd normal method as well
 */
    public abstract void learn();
     /**above it show gray cause java already abstract it for you
     it automatic public and it automatic abstract
     it unnecessary to type it so you can do just
     void learn(); => java know that it abstract method
      */
}
interface MyInterface2 {// another interface class

    /**
     * Class implements interface to inherit from it. it does not extends
     * so whatever in my implements it will inherited here in MyClass
     * Class can implements multiple/more than one interfaces at the same time
     * Class can implement multiple interface and must override abstract methods of all interfaces
     */
    class MyClass implements MyInterface, MyInterface2 {

        @Override
        public void learn() {
            System.out.println("Learning in MyClass");
        }
    }

    class Main {
        public static void main(String[] args) {
            // MyInterface myInterface = new MyInterface();
            // ERROR: cannot create object of interface same ERROR with abstract
            MyClass myClass = new MyClass(); // we still can create Object of sub class

        }
    }
}