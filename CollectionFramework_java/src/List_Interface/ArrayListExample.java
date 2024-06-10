package List_Interface;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        
        //generic type declaration to create arraylist
    	//ArrayList<String> fruits = new ArrayList<String>();
    	
    	
         List<String> fruits = new ArrayList<>();


        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Displaying the ArrayList
        System.out.println("ArrayList elements: " + fruits);

        // Accessing elements using index
        System.out.println("Element at index 1: " + fruits.get(1));

        // Updating an element
        fruits.set(2, "Mango");
        System.out.println("Updated ArrayList: " + fruits);

        // Removing an element
        fruits.remove("Banana");
        System.out.println("ArrayList after removing 'Banana': " + fruits);

        // Checking if an element exists
        boolean containsMango = fruits.contains("Mango");
        System.out.println("Does ArrayList contain 'Mango'? " + containsMango);

        // Getting the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of ArrayList: " + size);

        // Iterating through the ArrayList
        System.out.println("Iterating through ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clearing the ArrayList
        fruits.clear();
        System.out.println("ArrayList after clearing: " + fruits);
    }
}
