package basics;

public class Learn_1_ClassesObjects {
    public static void main(String[] args) {
        // Object Initiatialising of class Person
        Person p1 = new Person();

        // assinging values to class properties.
        p1.age = 24;
        p1.name = "Anuj Bhaiya";

        Person p2 = new Person();
        p2.age = 23;
        p2.name = "Aman Bhaiya";

        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);
    }
}

class Person {
    // Declaring class properties
    String name;
    int age;
}
