package List_Interface;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the linked list
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");

        // Displaying the linked list
        System.out.println("Linked List_Interface: " + linkedList);

        // Adding an element at the beginning
        linkedList.addFirst("New Element");

        // Displaying the updated linked list
        System.out.println("Updated Linked List_Interface: " + linkedList);

        // Adding an element at the end
        linkedList.addLast("Last Element");

        // Displaying the updated linked list
        System.out.println("Updated Linked List_Interface: " + linkedList);

        // Getting the first element
        String firstElement = linkedList.getFirst();
        System.out.println("First Element: " + firstElement);

        // Getting the last element
        String lastElement = linkedList.getLast();
        System.out.println("Last Element: " + lastElement);

        // Removing the first element
        linkedList.removeFirst();

        // Displaying the linked list after removal
        System.out.println("Linked List_Interface after removing the first element: " + linkedList);

        // Removing the last element
        linkedList.removeLast();

        // Displaying the linked list after removal
        System.out.println("Linked List_Interface after removing the last element: " + linkedList);
    }
}
