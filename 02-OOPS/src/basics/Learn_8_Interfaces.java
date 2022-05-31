package basics;

public class Learn_8_Interfaces implements CellPhones {
    public static void main(String[] args) {

    }

    @Override
    public void name() {
        System.out.println("Some Color");
    }
}

interface CellPhones {
    void name();
}
