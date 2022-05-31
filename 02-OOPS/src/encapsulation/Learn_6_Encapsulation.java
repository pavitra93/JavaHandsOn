package encapsulation;

public class Learn_6_Encapsulation {

    private int ram;
    private int price;

    public static void main(String[] args) {

    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /*
         Public can be accessed
         1. In this class
         2. In this package 'encapsulation'
         3. In other packages 'basics'
        */
    public void doWork() {
        System.out.println("Working...");
    }

    /*
     Protected can be accessed
     1. Only in this class
     2. In this package 'encapsulation' ONLY to child
     3. In other packages 'basics' ONLY to child class from its own object
    */
    protected void doEat() {
        System.out.println("Eating...");
    }

    /*
     Private can be accessed
     1. Only in this class
     2. Not in this package 'encapsulation'
     3. Not in other packages 'basics'
    */
    private void doSleep() {
        System.out.println("Sleeping...");
    }
}
