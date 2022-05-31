

import java.util.Stack;

public class Learn_Collections_02_StackList {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Add item in stack.
        // O(1)
        stack.push("Bottom Layer");
        stack.push("Mid Layer");
        stack.push("Top Layer");

        System.out.println(stack); // [Bottom Layer, Mid Layer, Top Layer]

        // Remove item from stack.
        // Removes last inserted.
        // O(1)
        stack.pop();
        System.out.println(stack); // [Bottom Layer, Mid Layer]

        // Get/peek item
        // Always displays last inserted
        // O(1)
        System.out.println(stack.peek()); // [Bottom Layer, Mid Layer]

    }
}
