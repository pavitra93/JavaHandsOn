import java.util.ArrayList;
import java.util.Scanner;

public class ArraySumOfIndexes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        while(size > 0) {
            A.add(sc.nextInt());
            size--;
        }

        // constraints: s, e <= N ( size of array), and [s,e] should be valid range;
        System.out.println(sumOfIndexes(A, 2, 4));
    }

    public static int sumOfIndexes(ArrayList<Integer>A, int start, int end) {
        int sum =0;

        for(int i=start; i<=end; i++) {
            sum = sum+ A.get(i);
        }

        return sum;
    }
}
