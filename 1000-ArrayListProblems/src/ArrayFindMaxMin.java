import java.util.ArrayList;
import java.util.Scanner;

public class ArrayFindMaxMin {
/*
    Write a program to print maximum and minimum elements of the input array A of size N
    where you have to take integer N and other N elements as input from the user.
*/
public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int length = sc.nextInt(); // Number of items in array
        ArrayList<Integer> arr = new ArrayList<>();
        while(length > 0) {
            arr.add(sc.nextInt());
            length--;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i) > max) {
                max = arr.get(i);
            }

            if(arr.get(i) < min) {
                min = arr.get(i);
            }
        }

    System.out.println(max + " " + min);
    }
}
