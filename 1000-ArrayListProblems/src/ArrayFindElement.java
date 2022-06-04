import java.util.ArrayList;
import java.util.Scanner;

/*
You are given an integer T (number of test cases).
 You are given array A and an integer B for each test case.
 You have to tell whether B is present in array A or not.
*/
public class ArrayFindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T > 0) {
            int length = sc.nextInt(); // Number of items in array
            ArrayList<Integer> arr = new ArrayList();
            while(length > 0) {
                arr.add(sc.nextInt());
                length--;
            }

            int item = sc.nextInt();

            if(arr.contains(item)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

            T--;
        }
    }
}
