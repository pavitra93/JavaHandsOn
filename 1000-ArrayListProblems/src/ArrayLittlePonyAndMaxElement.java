import java.util.ArrayList;

/*
Little Ponny is given an array, A, of N integers. In a particular operation,
 he can set any element of the array equal to -1.
 He wants your help in finding out the minimum number of operations required such that the maximum element of the resulting array is B.
 If it is not possible, then return -1.
*/
public class ArrayLittlePonyAndMaxElement{
    public static void main(String[] args) {

    }

    public int solve(ArrayList<Integer> A, int B) {
        int count = 0;
        if(!A.contains(B))
            return -1;
        for(int i =0; i < A.size(); i++) {
            if(A.get(i) > B) {
                count++;
            }
        }
        return count > 0 ? count : -1;
    }
}
