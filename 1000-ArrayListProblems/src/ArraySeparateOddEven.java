import java.util.ArrayList;
import java.util.Scanner;

public class ArraySeparateOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            ArrayList<Integer> arrMain = new ArrayList<>();
            ArrayList<Integer> arrEven = new ArrayList<>();
            ArrayList<Integer> arrOdd = new ArrayList<>();

            while (N > 0) {
                arrMain.add(sc.nextInt());
                N--;
            }

            for(int i=0; i< arrMain.size(); i++) {
                int num = arrMain.get(i);
                if(num%2==0)
                    arrEven.add(num);
                else
                    arrOdd.add(num);
            }

            System.out.println(arrEven);
            System.out.println(arrOdd);
            T--;
        }
    }
}
