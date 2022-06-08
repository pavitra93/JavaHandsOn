import java.util.ArrayList;

public class ArrayProductPuzzle {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int N = A.size();
        ArrayList<Integer> productArray = new ArrayList<>();
        int product = getProductofArray(A);
        for(int j=0; j<N;j++) {
            productArray.add(product/A.get(j));
        }

        return productArray;
    }

    public static int getProductofArray(ArrayList<Integer> B) {
        int product = 1;
        for(int i=0; i< B.size(); i++) {
            product *= B.get(i);
        }

        return product;
    }
}
