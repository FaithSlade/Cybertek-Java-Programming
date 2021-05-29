package day48_constructors_static;

public class BusObjects {
    public static void main(String[] args) {
        Bus bus = new Bus();
        //System.out.println(bus.toString()); get NullPointerException

        bus.driver = new Driver("Abbas");
        bus.engines = new Engines(10);
        System.out.println(bus.toString());

        Bus metroBus = new Bus();
        metroBus.driver = new Driver("Aziz");
        metroBus.engines = new Engines(15);

        System.out.println(metroBus);

        //print Driver name of metroBus
        System.out.println(metroBus.driver.getName());
    }
}
