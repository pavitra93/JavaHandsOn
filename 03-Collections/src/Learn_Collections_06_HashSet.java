

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Learn_Collections_06_HashSet {
    public static void main(String[] args) {
        Set<Integer> hashset = new HashSet<>();

        // Adds to set
        hashset.add(1);
        hashset.add(2);
        hashset.add(30);
        hashset.add(3);
        hashset.add(55);

        System.out.println(hashset);

        // Removes elements from set
        hashset.remove(3);
        System.out.println(hashset);

        // Gets element via loops or Iterator
        for (Integer setItem: hashset) {
            System.out.println(setItem);
        }

        // Check if set contains specific item
        System.out.println(hashset.contains(3));
        System.out.println(hashset.contains(2));

        // Check if set is empty
        System.out.println(hashset.isEmpty());

        // LinkedHash Set
        // Maintains order of items inserted
        HashSet<Integer> linkHashset = new LinkedHashSet<>();

        linkHashset.add(1);
        linkHashset.add(2);
        linkHashset.add(30);
        linkHashset.add(3);
        linkHashset.add(55);

        System.out.println(linkHashset);

        // TreeSet
        // Maintains sorted order of items inserted

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(30);
        treeSet.add(3);
        treeSet.add(55);

        System.out.println(treeSet);

    }
}
