package encapsulation;

public class Learn_6_1_Encapsulation_Child extends Learn_6_Encapsulation{

    public static void main(String[] args) {
        Learn_6_Encapsulation encapsulation_1 = new Learn_6_Encapsulation();
        encapsulation_1.doWork(); // Child class can access public members in same package
        encapsulation_1.doEat(); // Child class can access protected members in same package


        // Encapsulation example
        encapsulation_1.setPrice(30);
        encapsulation_1.setRam(4);

        System.out.println("Price is " + encapsulation_1.getPrice() + " and RAM is " + encapsulation_1.getRam());

    }
}
