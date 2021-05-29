package day48_constructors_static;

import java.util.Arrays;

public class GroupObjects {
    public static void main(String[] args) {
        // this call dependency injection. Group Object create depends on String name
        Group group1 = new Group("Cyberbugs");

        //print size of members: how many people in the group
        //we used getMember cause it Encapsulation mean it hinting in private
        System.out.println(group1.getMember().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");

        System.out.println(group1.getMember().size());
        System.out.println(group1.toString());

        Group group2 = new Group("CyberCats");
        group2.setMember(Arrays.asList("Stephen","Wakshum","Akrem","Bulent", "Andrea", "Andrei"));

        //print all member not .toString
        System.out.println(group2.getMember());

        //use if statement to check if Andrea in group2
        if(group2.getMember().contains("Andrea")){ //.getMember() mean all name list
            System.out.println("Andrea is a member of group2");
        }else{
            System.out.println("Andrea is not a member of group2");
        }
        //remove some member
        group1.removeMember("Pavel");
        group1.removeMember("Elvin");
        System.out.println(group2.toString());
    }
}
