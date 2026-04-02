// L6P4

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class ListDemo {
    public static void main(String... args) {

        // 1. Create the object of ArrayList
        ArrayList<String> l = new ArrayList<>();

        // 2. Check if the l is empty or not
        System.out.println("Is the ArrayList empty? " + l.isEmpty());

        // 3. Add any 5 colors
        l.add("Black");
        l.add("Brown");
        l.add("Blue");
        l.add("Red");
        l.add("Orange");
        System.out.println("Initial list: " + l);

        // 4. Remove the 4th index element 
        // Index 4 is "Orange" (0:Black, 1:Brown, 2:Blue, 3:Red, 4:Orange)
        l.remove(4); 
        
        // 5. Print all the elements
        System.out.println("After removal: " + l);

        // 6. Sort the elements
        Collections.sort(l);
        System.out.println("After sorting: " + l);

        // 7. Use iterator to print all the elements
        Iterator<String> i = l.iterator();
        System.out.print("Elements using iterator: ");
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();

        // 8. Print out the "top most" element
        // ArrayList doesn't have .peek(). Use .get(0) for the first element.
        if (!l.isEmpty()) {
            System.out.println("Top most element (index 0): " + l.get(0));
        }

        // 9. Remove all elements
        l.clear();
        System.out.println("After clearing: " + l);

        // 10. Check if empty
        System.out.println("Is l empty? " + l.isEmpty());
    }
}
