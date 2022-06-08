import java.util.ArrayList;

/*
You are given an integer array A of size N.
You have to pick B elements in total.
Some (possibly 0) elements from left end of array A and some (possibly 0) from the right end of array A to get the maximum sum.
Find and return this maximum possible sum.
*/
public class ArrayPickFromBothSides {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(3);
        A.add(5);
        A.add(6);

        System.out.println(createPrefixSum(A));
        System.out.println(solve(A, A.size()));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int N = A.size();
        if(B == N)
            B = N;
        ArrayList<Integer> pfsArray = new ArrayList<>();
        pfsArray =  createPrefixSum(A);
        int maxSum = Integer.MIN_VALUE;
        for(int x=0; x<=B; x++) {
            int currSum =0;
            if(x== 0 && B == N)
                currSum = pfsArray.get(N-1);
            else if (x == 0)
                currSum = pfsArray.get(N-1) - pfsArray.get(N-B+x-1);
            else {
                currSum = pfsArray.get(x-1) + pfsArray.get(N-1) - pfsArray.get(N-B+x-1);
            }

            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
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

