package day49_static;

public class StaticTest {
    public static void main(String[] args) {
        //1. Static method can be called using classname
        StaticMethods.displayMessage("wooden spoon");
        //1. Instance method needs an object to be called
        //StaticMethods.instanceMethod(); ERROR
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        //2.
    }
}
