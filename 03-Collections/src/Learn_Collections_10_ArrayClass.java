

import java.util.Arrays;
import java.util.List;

public class Learn_Collections_10_ArrayClass {
    public static void main(String[] args) {

        // Primitive Array
        Integer[] arrayNums = {1,2,3,4,5,0};
        Integer[] arrayNums2 = {1,232,3,44,53,02};

        // asList to copy primitive array as fixed length Lists
        // Will still have arrays features, and cannot add items to Lists
        // We can update values.
        List<Integer> lists = Arrays.asList(arrayNums);
        System.out.println(Arrays.toString(arrayNums));
        System.out.println(lists);

        // Binary Search an element in an array
        System.out.println(Arrays.binarySearch(arrayNums, 3));

        // Compares elements in an array
        // 0 if equal, 1 is first is bigger & -1 is second is bigger
        System.out.println(Arrays.compare(arrayNums, arrayNums2));

        // Compares address of two different arrays which are not equal
        // @5caf905d != @27716f4
        System.out.println(arrayNums + " " + arrayNums2);
        System.out.println(arrayNums.equals(arrayNums2));

        // Arrays.equals(a1, a2)
        // Compares actual arrays with each corresponding element
        System.out.println(Arrays.equals(arrayNums, arrayNums2));

        // Arrays.mismatch(a1, a2)
        // Returns first found index of a mismatched element from both
        System.out.println(Arrays.mismatch(arrayNums,arrayNums2));
    }
}
