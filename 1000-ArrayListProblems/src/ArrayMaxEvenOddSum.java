import java.util.ArrayList;
import java.util.List;

/*
 You are given an array of integers A of size N.
 Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.
*/
public class ArrayMaxEvenOddSum {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(-1);
        A.add(-66);
        A.add(35);
        A.add(40);

        solve(A);
    }

    public static void solve(ArrayList<Integer> A) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0; i< A.size(); i++) {
            if(A.get(i) > max && A.get(i)%2 == 0)
                max = A.get(i);
            if(A.get(i) < min && A.get(i)%2 != 0)
                min = A.get(i);
        }

        System.out.println(max - min);
    }
}
