package day44_custom_classes;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Animal {
    //this is attribute: data
    String type = "some animal";// if you remove the value of data it will show null


    //create object: behaviour
    public void animalEat(){
        System.out.println("can eat");
    }

    public void animalEat(String food){
        System.out.println("Eating " + food);
    }

    public void animalSpeak(){
        System.out.println(type + " can speak");
    }
}


