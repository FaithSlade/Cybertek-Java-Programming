package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp mobileApp = new MobileApp();
        mobileApp.name = "Youtube";
        mobileApp.useTheApp(10);

        Instagram instagram = new Instagram();
        instagram.name = "Instagram";
        instagram.useTheApp(20);

        Discord b22Discord = new Discord();
        b22Discord.name = "Discord";
        b22Discord.useTheApp(100);
    }
}
