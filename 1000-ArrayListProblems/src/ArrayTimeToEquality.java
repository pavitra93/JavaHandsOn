import java.util.ArrayList;

public class ArrayTimeToEquality {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(731);
        A.add(349);
        A.add(490);
        A.add(781);
        A.add(271);
        A.add(405);
        A.add(811);
        A.add(181);
        A.add(102);
        A.add(126);
        A.add(866);
        A.add(16);
        A.add(622);
        A.add(492);
        A.add(194);
        A.add(735);

        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        int count=0;
        int maxItem = findMax(A);
        for(int j=0; j< A.size(); j++) {
            count += (maxItem - A.get(j));
        }

        return count;
    }

    public static int findMax(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i < A.size(); i++) {
            if(A.get(i) > max)
                max = A.get(i);
        }

        return max;
    }
}
