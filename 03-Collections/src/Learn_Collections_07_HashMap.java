

import java.util.HashMap;
import java.util.Map;

public class Learn_Collections_07_HashMap {

    public static void main(String[] args) {
        Map<String,Integer> numbers = new HashMap<>();

        // Adds to hashmaps with ONLY unique keys
        // If added duplicate key, it updates the existing key's value
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);

        // Checks if keys exists in HashMap
        if(!numbers.containsKey("Four")) {
            numbers.put("Four", 4);
        }

        // Checks if value exists in HashMap
        System.out.println(numbers.containsValue(4));

        // Checks if hashMap is empty
        System.out.println(numbers.isEmpty());

        System.out.println(numbers);

        // Iterating through HashMap
        for (Map.Entry<String,Integer> e: numbers.entrySet()) {
            System.out.println(e); // to get single key value set
            System.out.println(e.getKey()); // to get single key out of eachSet
            System.out.println(e.getValue()); // to get single value out of eachSet
        }

        // Iterating just Keys
        for(String keys: numbers.keySet()) {
            System.out.println(keys);
        }

        // Iterating just Values
        for(Integer value: numbers.values()) {
            System.out.println(value);
        }

    }
}
