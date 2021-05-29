package day48_constructors_static;

public class Engines {
    private int cylinders;

    public Engines() {
    }
    public Engines(int cylinders) {
        this.cylinders = cylinders;
    }
    @Override
    public String toString() {
        return "Engines{" +
                "cylinders=" + cylinders +
                '}';
    }
    public int getCylinders() {
        return cylinders;
    }
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
