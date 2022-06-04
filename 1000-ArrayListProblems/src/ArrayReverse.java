import java.util.ArrayList;
import java.util.List;

public class ArrayReverse {
    public static void main(String[] args) {
            List<Integer> A = new ArrayList<>();
            A.add(1);
            A.add(2);
            A.add(3);
            A.add(4);
            A.add(5);

        System.out.println(solve(A));

    }

    public static ArrayList<Integer> solve(final List<Integer> A) {
        ArrayList<Integer> revArr = new ArrayList<>();
        for(int i=A.size()-1; i >= 0; i--) {
            revArr.add(A.get(i));
        }
        return revArr;
    }
}
