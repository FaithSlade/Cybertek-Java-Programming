package day52_inheritance;

public class Discord extends MobileApp{
    public void chat(String someone){
        System.out.println("Chatting with " + someone + " on Discord");
    }
//   Overloading method
//    protected boolean download(double version) {
//        System.out.println("Downloaded Discord " + version);
//        return super.download();
//    }

    /**
     * override download method
     * @Override you don't need to import it, it come with java. lang.*
     */

    @Override//protected example
    public boolean download(){
        System.out.println("Downloaded Discord");
        return true;
    }

    @Override
    public void useTheApp(int minutes) {
        super.useTheApp(minutes);
        chat("Vladislav");
    }
}
