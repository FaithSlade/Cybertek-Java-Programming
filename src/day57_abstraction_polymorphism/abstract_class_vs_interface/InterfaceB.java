package day57_abstraction_polymorphism.abstract_class_vs_interface;

import java.io.Serializable;

public interface InterfaceB extends InterfaceA, Serializable, Cloneable{
    // extending -> class can extends one abstract class
    //           -> class can implements multiple interfaces
}
