package day48_constructors_static;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class Group {
    //we try to do it in ArrayList this is really common at work

    private String name;
    //private List<String> member = new ArrayList<>();
    private List<String> member;

    //constructor that accepts a name: we must pass String
    public Group(String name){
        this.name = name;// this what group1 inside the parenthesis
        member = new ArrayList<>();// null
    }

    public void addMember(String newMember){
        member.add(newMember);
    }
    public void removeMember(String memberName){
        member.remove(memberName);
    }
    @Override
    public java.lang.String toString() {
        return "Group{" +
                "groupName='" + name + '\'' +
                ", member=" + member +
                '}';
    }
    public java.lang.String getGroupName() {
        return name;
    }

    public void setGroupName(java.lang.String groupName) {
        this.name = groupName;
    }

    public List<String> getMember() {
        return member;
    }

    public void setMember(List<String> member) {
        this.member = member;
    }
}
