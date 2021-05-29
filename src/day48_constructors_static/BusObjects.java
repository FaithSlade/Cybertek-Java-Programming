package day48_constructors_static;

public class BusObjects {
    public static void main(String[] args) {
        Bus bus = new Bus();
        //System.out.println(bus.toString()); get NullPointerException

        bus.driver = new Driver("Abbas");
        bus.engines = new Engines(10);
        System.out.println(bus.toString());
    }
}
