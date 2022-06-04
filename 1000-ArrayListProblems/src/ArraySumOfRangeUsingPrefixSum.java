import java.util.ArrayList;
import java.util.Scanner;

public class ArraySumOfRangeUsingPrefixSum {
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
        // Creates pfs of A
        ArrayList<Integer> pfsArray = new ArrayList<>();
        pfsArray =  createPrefixSum(A);
        System.out.println("Prefix Sum Array of A: " + pfsArray);
        // Sum of range [s, e] using PfS array = pfsArray[e] - pfsArray[s-1]
        System.out.println("Sum between s=1 & e=3 in above pfsArray is: " + (pfsArray.get(3) - pfsArray.get(0)) );
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
