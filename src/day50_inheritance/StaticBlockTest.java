package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1 = new StaticBlockDemo();//run only this one cause 1 time then constructor run
        StaticBlockDemo st2 = new StaticBlockDemo();//this one static will not run, constructor run only
        StaticBlockDemo st3 = new StaticBlockDemo(); // constructor
        System.out.println(StaticBlockDemo.num);//25
        StaticBlockDemo st4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num);//75
    }
}
