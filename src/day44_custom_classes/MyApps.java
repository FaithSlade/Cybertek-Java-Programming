package day44_custom_classes;

public class MyApps {
    public static void main(String[] args) {
        //  String app1 = "uber"; this is string object. just characters
        App uberApp = new App();//creating new object

        //opening Uber app - version = 10.1
        uberApp.name = "Candy Crush";
        uberApp.version = 10.1;
        uberApp.open(); //call open method using object variable

        uberApp.version = 10.2;//change to something new
        //uberApp.open();//open new version to update it and run
    }
}

