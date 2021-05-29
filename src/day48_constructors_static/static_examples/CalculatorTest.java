package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        //add is static method, can be called using Classname.staticMethodName
        //static way of calling the method
        Calculator.add(5,3);

        //Calculator.multiply(2,4); ERROR: multiply is not static need object to call it
        //multiply is instance method, and we are creating object then calling it
        Calculator calculatorObject = new Calculator();
        calculatorObject.multiply(2,4);

        //static method can also be called using an object: you will get a notice
        calculatorObject.add(10,45);
    }
}
