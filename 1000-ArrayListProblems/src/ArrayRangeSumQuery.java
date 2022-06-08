import java.util.ArrayList;

public class ArrayRangeSumQuery {

    public static void main(String[] args) {

    }

    public static ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Long> querySumArray = new ArrayList<>();
        ArrayList<Integer> pfsArray = new ArrayList<>();
        pfsArray =  createPrefixSum(A);
        for (int i=0; i<B.size(); i++) {
            ArrayList<Integer> range= B.get(0);
            int s = range.get(0);
            int e = range.get(1);
            long sumRange = 0L;
            sumRange += pfsArray.get(e) - pfsArray.get(s-1);
            querySumArray.add(sumRange);
        }

        return querySumArray;
    }

    public static ArrayList<Integer> createPrefixSum(ArrayList<Integer> arr) {
        ArrayList<Integer> prefixSumArray = new ArrayList<>();
        prefixSumArray.add(0);
        prefixSumArray.add(arr.get(0));
        for(int i=2; i<= arr.size(); i++) {
            prefixSumArray.add(prefixSumArray.get(i-1) + arr.get(i-1));
        }
        return  prefixSumArray;
    }
}
