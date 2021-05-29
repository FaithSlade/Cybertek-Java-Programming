package day48_constructors_static;

public class Customer {
    //public Customer(String name, int id){
    //        this.name = name;
    //        this.id = id;
    private String name;
    private int id;

    //No-Args Constructor: no parameter
    public  Customer(){
        System.out.println("No-args constructor");
        name = "new customer";
        id = -1;
    }

    //aad a Constructor with params where we can assign name and id
    public Customer(String name, int id){
        System.out.println("2-args constructor");
        this.name = name; //setName(name);
        this.id = id; //setId(id); when we have some conditions in setter so I reuse that code here
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
