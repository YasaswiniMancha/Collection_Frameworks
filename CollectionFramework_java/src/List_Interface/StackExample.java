package List_Interface;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // Creating a stack
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        //LIFO 
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

        // Displaying the stack
        System.out.println("Stack: " + stack);

        // Popping an element
        String poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);

        // Displaying the stack after popping
        System.out.println("Stack after pop: " + stack);

        // Peeking at the top element without removing it
        String topElement = stack.peek();
        System.out.println("Top Element: " + topElement);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Stack Empty? " + isEmpty);

        // Finding the position of an element in the stack
        int position = stack.search("Element 2");
        System.out.println("Position of 'Element 2': " + position);
    }
}

