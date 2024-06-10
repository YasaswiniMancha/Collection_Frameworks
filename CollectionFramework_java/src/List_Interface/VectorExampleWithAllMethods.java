package List_Interface;


	import java.util.*;

	public class VectorExampleWithAllMethods {

	    public static void main(String[] args) {
	        // Creating a Vector
	        Vector<String> vector = new Vector<>();

	        // 1. add(E e)
	        vector.add("Apple");
	        vector.add("banana");
	        vector.add("blueberry");
	        vector.add("raspberry");
	        vector.add("strawberry");
	        vector.add("pineapple");
	        vector.add("apple");
	        
	        System.out.println("List_Interface after adding elements : " + vector);

	        
	        

	        // 2. add(int index, E element)
	        vector.add(1, "Banana");
	        
	        System.out.println("List_Interface after adding another element using index: " + vector);


	        // 3. addAll(Collection<? extends E> c)
	        List<String> additionalElements = Arrays.asList("CustardApple", "Malberry");
	        vector.addAll(additionalElements);
	        
	        System.out.println("List_Interface that adds with the collection of elements: " + vector);


	        // 4. addAll(int index, Collection<? extends E> c)
	        vector.addAll(2, additionalElements);
	        
	        System.out.println("List_Interface that adds with the collection of elements at paticular index :" + vector);


	        // 5. addElement(E obj)
	        vector.addElement("Guava");
	        
	        System.out.println("List_Interface after adding element : " + vector);


	        // 6. capacity()
	        int capacity = vector.capacity();
	        
	        System.out.println(" vector capacity :" + capacity);


	        // 7. clear()
	        vector.clear();
	        System.out.println(" after clear() list be like :" + vector);
	        
	        vector.add("Apple");
	        vector.add("banana");
	        vector.add("blueberry");
	        vector.add("raspberry");
	        vector.add("strawberry");
	        vector.add("pineapple");
	        vector.add("apple");
	        System.out.println(" vector with elements added again:" + vector);



	        // 8. clone()
	        Vector<String> clonedVector = (Vector<String>) vector.clone();
	        
	        System.out.println(" vector clone() as another vector named clonedVector :" + clonedVector);


	        // 9. contains(Object o)
	        boolean containsElement = vector.contains("Blueberry");
	        System.out.println(" vector contains Blueberry or not? :" + containsElement);


	        // 10. containsAll(Collection<?> c)
	        boolean containsAllElements = vector.containsAll(additionalElements);
	        System.out.println(" vector containsAll(additionalElements) or not? :" + containsAllElements);


	        // 11. copyInto(Object[] anArray)
	        String[] array = new String[vector.size()];
	        vector.copyInto(array);

	        System.out.println("After copying in array :"+array);
	        
	        vector.add("banana");
	        vector.add("blueberry");
	        vector.add("raspberry");
	        vector.add("strawberry");
	        vector.add("pineapple");
	        vector.add("apple");
	        
	        // 12. elementAt(int index)
	        String elementAtIndex = vector.elementAt(0);
	        
	        System.out.println("to know the element at 0th index :"+elementAtIndex);


	        // 13. elements()
	        Enumeration<String> enumeration = vector.elements();
	        System.out.println("Enumeration of elements :"+vector.elements());

	        // 14. ensureCapacity(int minCapacity)
	        vector.ensureCapacity(20);
             

	        // 15. equals(Object o)
	        
	        boolean isEqual = vector.equals(clonedVector);
	        if(isEqual) {
	        	System.out.println("both the vector and cloned vector are same");
	        }else {
	        	System.out.println("both the vector and cloned vector are not same");

	        }

	        // 16. firstElement()
	        String firstElement = vector.firstElement();
        	System.out.println("first element: " +firstElement);

	        
        	System.out.print("vector using forEach: " );

	        // 17. forEach(Consumer<? super E> action)
	        vector.forEach(System.out::println);
	        


	        // 18. get(int index)
	        String elementAtIndex2 = vector.get(2);
        	System.out.println("At index 2:  " +vector.get(2));


        	

            // 19. hashCode()
            int hashCode = vector.hashCode();
            System.out.println("Hash Code: " + hashCode);

            // 20. indexOf(Object o)
            int indexOfElement = vector.indexOf("Malberry");
            System.out.println("Index of 'Malberry': " + indexOfElement);

            // 21. indexOf(Object o, int index)
            int indexOfElementFromIndex = vector.indexOf("Malberry", 2);
            System.out.println("Index of 'Malberry' from index 2: " + indexOfElementFromIndex);

            // 22. insertElementAt(E obj, int index)
            vector.insertElementAt("Guava", 1);
            System.out.println("After inserting 'Guava' at index 1: " + vector);

            // 23. isEmpty()
            boolean isEmpty = vector.isEmpty();
            System.out.println("Is Vector empty? " + isEmpty);


         // 24. iterator()
            Iterator<String> iterator = vector.iterator();
            System.out.print("Vector elements using iterator: ");
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println();

            // 25. lastElement()
            String lastElement = vector.lastElement();
            System.out.println("Last element: " + lastElement);

            // 26. lastIndexOf(Object o)
            int lastIndexOfElement = vector.lastIndexOf("Malberry");
            System.out.println("Last index of 'Malberry': " + lastIndexOfElement);

            // 27. lastIndexOf(Object o, int index)
            int lastIndexOfElementFromIndex = vector.lastIndexOf("Malberry", 3);
            System.out.println("Last index of 'Malberry' from index 3: " + lastIndexOfElementFromIndex);

            // 28. listIterator()
            ListIterator<String> listIterator = vector.listIterator();
            System.out.print("Vector elements using list iterator: ");
            while (listIterator.hasNext()) {
                System.out.print(listIterator.next() + " ");
            }
            System.out.println();

            // 29. listIterator(int index)
            ListIterator<String> listIteratorAtIndex = vector.listIterator(2);
            System.out.print("Vector elements using list iterator from index 2: ");
            while (listIteratorAtIndex.hasNext()) {
                System.out.print(listIteratorAtIndex.next() + " ");
            }
            System.out.println();


         // 30. remove(int index)
         vector.remove(1);
         System.out.println("Vector after removing element at index 1: " + vector);

         // 31. remove(Object o)
         vector.remove("Apple");
         System.out.println("Vector after removing 'Apple': " + vector);

         // 32. removeAll(Collection<?> c)
         vector.removeAll(additionalElements);
         System.out.println("Vector after removing all elements in the collection: " + vector);

         // 33. removeAllElements()
         vector.removeAllElements();
         System.out.println("Vector after removing all elements: " + vector);

         // 34. removeElement(Object obj)
         vector.removeElement("Banana");
         System.out.println("Vector after removing 'Banana': " + vector);
         
         
	        vector.add("Blueberry");
	        vector.add("Strawberry");
	        vector.add("Raspberry");
	        vector.add("Malberry");
	         System.out.println("Vector after adding new elements : " + vector);

         // 35. removeElementAt(int index)
         vector.removeElementAt(0);
         System.out.println("Vector after removing element at index 0: " + vector);

         // 36. removeIf(Predicate<? super E> filter)
         vector.removeIf(element -> element.startsWith("A"));
         System.out.println("Vector after removing elements starting with 'A': " + vector);

	     

	        
	        // 37. removeRange(int fromIndex, int toIndex)

	        System.out.println("List_Interface before removeRange(1, 3): " + vector);
	        vector.subList(1, 3).clear();
	        System.out.println("List_Interface after removeRange(1, 3): " + vector);


	        // 38. replaceAll(UnaryOperator<E> operator)
	        vector.replaceAll(String::toUpperCase);

	     // 39. retainAll(Collection<?> c)
	        vector.retainAll(Arrays.asList("Banana", "Grapes"));
	        System.out.println("After retainAll: " + vector);

	        // Add elements
	        vector.add("banana");
	        vector.add("blueberry");
	        vector.add("raspberry");
	        vector.add("strawberry");
	        vector.add("pineapple");
	        vector.add("apple");
	        System.out.println("After adding elements: " + vector);

	        // 40. set(int index, E element)
	        vector.set(0, "sapota");
	        System.out.println("After set(0, 'sapota'): " + vector);

	        // 41. setElementAt(E obj, int index)
	        vector.setElementAt("custardapple", 1);
	        System.out.println("After setElementAt('custardapple', 1): " + vector);

	        // 42. setSize(int newSize)
	        vector.setSize(2);
	        System.out.println("After setSize(2): " + vector);

	        // 43. size()
	        int size = vector.size();
	        System.out.println("Vector size: " + size);

	        // 44. sort(Comparator<? super E> c)
	        vector.sort(Comparator.reverseOrder());
	        System.out.println("After sorting in reverse order: " + vector);

	        // 45. spliterator()
	        Spliterator<String> spliterator = vector.spliterator();
	        System.out.println("Spliterator created: " + spliterator);

	        // 46. subList(int fromIndex, int toIndex)
	        List<String> subList = vector.subList(0, 2);
	        System.out.println("Sublist (0 to 2): " + subList);

	        // 47. toArray()
	        Object[] array2 = vector.toArray();
	        System.out.println("toArray(): " + Arrays.toString(array2));

	        // 48. toArray(T[] a)
	        String[] array3 = vector.toArray(new String[0]);
	        System.out.println("toArray(new String[0]): " + Arrays.toString(array3));

	        // 49. toString()
	        String vectorString = vector.toString();
	        System.out.println("Vector as String: " + vectorString);

	        // 50. trimToSize()
	        vector.trimToSize();
	        System.out.println("After trimToSize(): " + vector);
	    }
	}
