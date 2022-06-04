import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayRotateLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfA = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        while(sizeOfA > 0) {
            A.add(sc.nextInt());
            sizeOfA--;
        }

        int sizeOfB = sc.nextInt();
        ArrayList<Integer> B = new ArrayList<>();
        while(sizeOfB > 0) {
            B.add(sc.nextInt());
            sizeOfB--;
        }

        System.out.println(solve(A,B));
    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> matrixArr = new ArrayList<>();
        int N = A.size();
        for(int value: B) {
            value =value%N;
            ArrayList<Integer> arr = new ArrayList<>(A);
            solveReversePart(arr, 0, N-1);
            solveReversePart(arr, 0, N-value-1);
            solveReversePart(arr, N-value,N-1);

            matrixArr.add(arr);
        }

        return matrixArr;
    }

    public static void solveReversePart(final ArrayList<Integer> arr, int startIndex, int endIndex) {
        int j = endIndex;
        for (int i = startIndex; i < j; i++, j--) {
            Collections.swap(arr, i, j);
        }
        return;
    }
}
