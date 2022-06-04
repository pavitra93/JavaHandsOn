import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        while(size > 0) {
            A.add(sc.nextInt());
            size--;
        }

        // constraints: s, e <= N ( size of array), and [s,e] should be valid range;
        System.out.println(A);
        System.out.println("Prefix Sum Array: " + createPrefixSum(A));
    }

    public static ArrayList<Integer> createPrefixSum(ArrayList<Integer> arr) {
        ArrayList<Integer> prefixSumArray = new ArrayList<>();
        prefixSumArray.add(arr.get(0));
        for(int i=1; i< arr.size(); i++) {
            prefixSumArray.add(prefixSumArray.get(i-1) + arr.get(i));
        }
        return  prefixSumArray;
    }
}
