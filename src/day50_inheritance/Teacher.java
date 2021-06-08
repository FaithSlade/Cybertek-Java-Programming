package day50_inheritance;

/**
 * sub class
 * Child Class
 * Derived Class
 */
public class Teacher extends Person{
    int teacherID;

    public void teach(String topic){
        System.out.println("Teacher is teaching" + topic);
    }
}
