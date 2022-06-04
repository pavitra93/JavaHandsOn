import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayReverse2 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        System.out.println(solveReversePart(A, 2, 4));
    }

        public static ArrayList<Integer> solveReversePart(final ArrayList<Integer> A, int startIndex, int endIndex) {
            int j = endIndex;
            for(int i= startIndex; i<j; i++,j--) {
                Collections.swap(A, i, j);
            }
            return A;
        }
}
