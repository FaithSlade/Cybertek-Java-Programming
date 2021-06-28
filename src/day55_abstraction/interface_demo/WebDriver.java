package day55_abstraction.interface_demo;

public interface WebDriver {
    public abstract void get(String url); //get mean navigate
    public abstract void findElement(String locator);
    void quit(); //it is automatically public abstract
    String getTitle();
}
