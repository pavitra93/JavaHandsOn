import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
You are given an integer array A.
 You have to find the second largest element/value in the array or report that no such element exists.
 **Remember**: All elements in the ArrayList must be mutually comparable, else it throws ClassCastException.
 Here, mutually comparable means the list must have the same type of elements
*/
public class ArraySecondLargest {
    public static void main(String[] args) {

    }

    public int solve(ArrayList<Integer> A) {
        if(A.size() <= 1)
            return -1;

        int max = -1;
        int index = 0;
        for (int i=0; i < A.size(); i++) {
            if(A.get(i) > max) {
                max = A.get(i);
                index = i;
            }
        }

        max = -1;
        for(int i =0; i< A.size(); i++) {
            if(i != index) {
                max = Math.max(A.get(i), max);
            }
        }

        return max;

/*
        Collections.sort(A);
        return A.get(A.size()-2);
*/
    }

}
