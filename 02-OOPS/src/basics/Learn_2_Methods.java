package basics;

public class Learn_2_Methods {
    public static void main(String[] args) {
        Dogs d1 = new Dogs();

        d1.name = "Leo";
        d1.breed = "Labrador";
        d1.age = 2;

        Dogs d2 = new Dogs();
        d2.name = "Maggi";
        d2.breed = "German Shepherd";
        d2.age = 1;

        // Calling class methods
        d1.type();
        d2.type();
        // Calling
        d2.type("Germany");

    }
}

class Dogs {
    String name, breed;
    int age;

    void type() {
        System.out.println(name + " is of " + breed + " breed");
    }
    // Defining methods
    void age() {
        System.out.println(name + " is of " + age + " age");
    }

    // Polymorphism
    // Method Overloading - Multiple methods with different sets of args in same class
    void type(String country) {
        System.out.println(name + " is of " + breed + " breed & country origin is " + country );
    }
}