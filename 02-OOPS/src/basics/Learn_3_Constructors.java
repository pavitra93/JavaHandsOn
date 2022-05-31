package basics;

public class Learn_3_Constructors {
    public static void main(String[] args) {
        // Constructor is called
        // in every new object creation
        Humans h1 = new Humans();
        Humans h2 = new Humans();

        // Constructors can also be overloaded in class & called with args
        Humans h3 = new Humans("Male","Pavitra Mehta", 29);
        h3.getInfo();
    }
}

class Humans {
    String type, name;
    int age;

    public Humans() {
        System.out.println("Constructor Called");
    }

    // Constructors can also be overloaded
    public Humans(String type, String name, int age) {
        // this() is if you wish to call the other constructor of the same class
        // Cannot be called in other methods
        this();
        this.type = type;
        this.name = name;
        this.age  = age;
    }

    public void getInfo() {
        System.out.println("Name is " + name + ". He is a " + type +  " gender & of age" + age);
    }
}
