import java.util.ArrayList;
import java.util.Scanner;

public class ArrayRotateLeft2 {
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
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                arr.add(A.get((i + value) % N));
            }
            matrixArr.add(arr);
        }

        return matrixArr;
    }
}
