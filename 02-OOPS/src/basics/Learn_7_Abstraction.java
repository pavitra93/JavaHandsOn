package basics;

public class Learn_7_Abstraction {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.start();

        BMW bmw = new BMW();
        bmw.start();
    }
}

class Audi extends  Car {
    @Override
    void start() {
        System.out.println("Audi is starting");
    }
}

class BMW extends Car {
    @Override
    void start() {
        System.out.println("BMW is starting");
    }
}

/*
 Abstraction is basically a concept of something
 This concept is than used by other classes by inheritance
 If a class is abstract its methods are also abstract
 Abstract methods DO NOT have their defination in abstract class, as
 it is also a concept.
*/
abstract class Car {
    int price;

    abstract void start();

    /*
       You can also define non-abstract methods in an abstract class
    */
    void color(){
        System.out.println("Black");
    }
}
