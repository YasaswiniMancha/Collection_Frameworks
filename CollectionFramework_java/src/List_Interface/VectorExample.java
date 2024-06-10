package List_Interface;

import java.util.Vector;
import java.util.Iterator;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Displaying the Vector
        System.out.println("Vector elements: " + vector);

        // Accessing elements using indexes
        System.out.println("Element at index 1: " + vector.get(1));

        // Checking if an element is present
        System.out.println("Contains 'Banana': " + vector.contains("Banana"));

        // Finding the index of an element
        System.out.println("Index of 'Orange': " + vector.indexOf("Orange"));

        // Removing an element
        vector.remove("Apple");
        System.out.println("After removing 'Apple': " + vector);

        // Iterating through the Vector
        System.out.print("Iterating through the Vector: ");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // Checking if the Vector is empty
        System.out.println("\nIs the Vector empty? " + vector.isEmpty());

        // Getting the size of the Vector
        System.out.println("Size of the Vector: " + vector.size());
    }
}
