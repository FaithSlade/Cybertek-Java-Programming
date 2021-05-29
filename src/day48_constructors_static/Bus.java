package day48_constructors_static;

public class Bus {
    Driver driver;
    Engines engines;

    public String toString(){
        return driver.getName() + " | " + engines.getCylinders();
    }


}
