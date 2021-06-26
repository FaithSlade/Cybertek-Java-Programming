package day44_custom_classes;

public class AnimalObject {
    public static void main(String[] args) {
        Animal newAnimal = new Animal();

        System.out.println(newAnimal.type);
        newAnimal.animalEat();//overloading
        newAnimal.animalEat("grass"); //overloading
        newAnimal.animalSpeak();

//      create object cheetahObj
        Animal cheetahObj = new Animal();
        cheetahObj.type = "cheetah";//change value/reassign to "cheetah"
        System.out.println(cheetahObj.type);//some animal

        cheetahObj.animalEat("Meat");

    }
}

