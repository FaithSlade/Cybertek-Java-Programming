package day55_abstraction.exercise_example;

public abstract class Exercise {//abstract class can have non-abstract method and abstract method

//non-abstract method but it will reuse this method in sub class basically it is inherited this method
    public void start() { //you can use it as itself or override up to you
         System.out.println("Warming up and starting the exercise");
    }

    // public final void start() -> cannot override cause final
    /**
     * -abstract method - method without body/impl, just signature
     * -purpose: letting sub classes implement/override their own way
     */
    public abstract void perform();// exercise can be perform but we going to hind it

    /**
     * another abstract method that concrete sub classes will override/implement
     * abstract method can have return type
     * @param minutes - how long is exercise is performed
     * @return number of calories burned/used
     */
     public abstract int getCaloriesCount(int minutes);
}
