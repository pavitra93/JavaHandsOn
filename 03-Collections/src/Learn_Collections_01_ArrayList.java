
import java.util.Iterator;
import java.util.List;

public class Learn_Collections_01_ArrayList {
    public static void main(String[] args) {
        List<Integer> items = new java.util.ArrayList<>();
        // Add items
        // O(1)
        items.add(30);
        items.add(1,40);
        System.out.println(items); // [30, 40]

        // Add two arraylist
        List<Integer> items2 = new java.util.ArrayList<>();
        items2.add(200);
        items.addAll(items2);
        System.out.println(items); // [30, 40, 200]

        // Remove item
        // O(n)
        items.remove(2);
        System.out.println(items); // [30, 40]

        // Get item value
        // O(1)
        System.out.println(items.get(1)); // 40

        // Update item
        // O(1)
        items.set(1,300);
        System.out.println(items); // [30, 300]

        // Check if value exists
        // O(n)
        boolean itemExists = items.contains(300);
        System.out.println(itemExists); // true

        // Get size of arraylist
        System.out.println(items.size()); // 2

        // Iterate each element
        // For Loop
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }

        // Foreach Loop
        for (Integer item: items) {
            System.out.println(item);
        }

        // Iterator
        Iterator<Integer> it = items.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
