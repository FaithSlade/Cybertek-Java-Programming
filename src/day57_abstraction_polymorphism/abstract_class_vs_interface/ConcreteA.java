package day57_abstraction_polymorphism.abstract_class_vs_interface;
/**
First non-abstract child class of abstract class or interface is called Concrete class
why we said first because concreteA class can have classB extends concreteA then it not
actually concrete because direct parent it not abstract class so we don't call that class is concrete class
 Ex: public class B extends concreteA -> this not concrete class just sub class
 - classB parent is not direct parent it not abstract

 */
public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB{
    @Override //Concrete sub class must override abstract method from abstract class or interface
    public void absMethodA() {//from AbstractA

    }

    @Override//sub class can override non-final methods from parent class
    public void methodB() {//from AbstractA
        super.methodB();
        System.out.println("from AbstractA normal method, override is optional");
    }

    //@Override -> static methods are hidden not overridden
    public static void staticMethodC(){//from AbstractA
        System.out.println("staticMethodC hidden version is called");
    }

    @Override//Concrete sub class must override abstract method from abstract class or interface
    public void absMethodD(int num) {//from interfaceA

    }

}
