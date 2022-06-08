import java.util.ArrayList;

/*
Count ways to make sum of odd and even
 indexed elements equal by removing an array element
*/
public class ArraySumOddEvenCount {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(1);
        A.add(1);
//        A.add(4);

        System.out.println(solve(A));
    }


    // Naive and O(n^2) solution
    public static int solve(ArrayList<Integer> A) {
        int count=0;
        for(int i=0; i< A.size(); i++) {
            int item = A.remove(i);
            ArrayList<Integer> newA = new ArrayList<>(A);
            int sumEven =0;
            int sumOdd =0;
            for(int j=0; j<newA.size(); j++) {
                if(j%2==0) {
                    sumEven += newA.get(j);
                } else {
                    sumOdd += newA.get(j);
                }
            }

            A.add(i, item);

            if(sumEven == sumOdd)
                count++;
        }

        return count;
    }

    public static int solveBetter(ArrayList<Integer> A) {
        int count=0;
        for(int i=0; i< A.size(); i++) {
            int item = A.remove(i);
            ArrayList<Integer> newA = new ArrayList<>(A);
            int sumEven =0;
            int sumOdd =0;
            for(int j=0; j<newA.size(); j++) {
                if(j%2==0) {
                    sumEven += newA.get(j);
                } else {
                    sumOdd += newA.get(j);
                }
            }

            A.add(i, item);

            if(sumEven == sumOdd)
                count++;
        }

        return count;
    }
}
