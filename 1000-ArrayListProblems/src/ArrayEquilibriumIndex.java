import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEquilibriumIndex {
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
        System.out.println("Equilibrium index exists at index: " + equilibriumIndexExists(pfsArray));

    }

    public static ArrayList<Integer> createPrefixSum(ArrayList<Integer> arr) {
        ArrayList<Integer> prefixSumArray = new ArrayList<>();
        prefixSumArray.add(arr.get(0));
        for(int i=1; i< arr.size(); i++) {
            prefixSumArray.add(prefixSumArray.get(i-1) + arr.get(i));
        }
        return  prefixSumArray;
    }

    public static int equilibriumIndexExists(ArrayList<Integer> A) {
        int sumLeft =0;
        int sumRight = 0;
        int N = A.size();
        for(int i=0; i < N; i++) {
            if( i==0 )
                sumLeft = 0;
            else
                sumLeft = A.get(i-1);

            sumRight = A.get(N-1) - A.get(i);

            if(sumLeft == sumRight)
                return i;
        }

        return -1;
    }
}
