package basics;

public class Learn_4_Static_Keyword {
    public static void main(String[] args) {
        // You can call static methods and properties of the class without the need of objects
        //
        System.out.println(Country.count);

        Country c1 = new Country();
    }
}

class Country {
    static  int count;

    public Country() {
        System.out.println("Constructor Called");
        count++;
    }
}
