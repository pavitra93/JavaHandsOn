import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayRotateRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        while (N > 0) {
            A.add(sc.nextInt());
            N--;
        }

        N = A.size();
        int B = sc.nextInt();
        B = B % N;

        solveReversePart(A, 0, N - 1);
        solveReversePart(A, 0, B - 1);
        solveReversePart(A, B, N - 1);

        for (int item : A) {
            System.out.print(item + " ");
        }
    }

    public static  void solveReversePart(final ArrayList<Integer> A, int startIndex, int endIndex) {
        int j = endIndex;
        for (int i = startIndex; i < j; i++, j--) {
            Collections.swap(A, i, j);
        }
        return;
    }
}

