package List_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExampleWithAllMethods {
    public static void main(String[] args) {
        // Creating a List_Interface using ArrayList
        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("grapes");

        // Displaying the original list
        System.out.println("Original List_Interface: " + fruits);

        // Using equals() to compare two lists
        List<String> anotherList = new ArrayList<>();
        anotherList.add("Apple");
        anotherList.add("Banana");
        anotherList.add("Orange");
        System.out.println("Are the two lists equal? " + fruits.equals(anotherList));

        // Getting the size of the list
        System.out.println("Size of the list: " + fruits.size());

        // Adding elements at a specific index
        fruits.add(1, "Grapes");

        // Displaying the modified list
        System.out.println("List_Interface after adding 'Grapes' at index 1: " + fruits);

        // Removing an element at a specific index
        fruits.remove(2);
        // Removing a specific element
        fruits.remove("grapes");

        // Displaying the list after removing an element
        System.out.println("List_Interface after removing the element at index 2: " + fruits);

        // Adding all elements from another collection
        List<String> moreFruits = new ArrayList<>();
        moreFruits.add("Pineapple");
        moreFruits.add("Strawberry");
        fruits.addAll(moreFruits);

        // Displaying the list after adding all elements from another collection
        System.out.println("List_Interface after adding all elements from another collection: " + fruits);
        //checks if the list is empty or not
         if(!fruits.isEmpty()){
        // Getting an element at a specific index
        System.out.println("Element at index 3: " + fruits.get(3));
         } else{
             System.out.println("no elements");
         }

        // Last index of an element
        System.out.println("Last index of 'Orange': " + fruits.lastIndexOf("Orange"));

        // Index of an element
        System.out.println("Index of 'Apple': " + fruits.indexOf("Apple"));

        // Hash code of the list
        System.out.println("Hash code of the list: " + fruits.hashCode());

        // Checking if the list contains all elements of another collection
        System.out.println("Does the list contain all elements of another collection? " + fruits.containsAll(moreFruits));

        // Sorting the list
        Collections.sort(fruits);

        // Displaying the sorted list
        System.out.println("Sorted List_Interface: " + fruits);

        // Iterating through the list using Iterator
        System.out.println("Iterating through the list using Iterator:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
