// L6P3

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class SetDemo {
    public static void main(String... args) {
        // 1 Create object of the set
        Set<String> p = new HashSet<>();
        // 2 check if the set is empty or not
        System.out.println("Is the Set empty? " + p.isEmpty());
        // 3 Add any 5 elements
        p.add("Black");
        p.add("Brown");
        p.add("Blue");
        p.add("Red");
        p.add("Orange");
        // 4 print all elements of the set
        System.out.println(p);
        // 5 remove the element at the 4th index
        p.remove("Red");
        System.out.println("After removal: " + p);
        // 6 show the elements with the help of iterator
        Iterator<String> i = p.iterator();
        System.out.print("Elements using iterator: ");
        while (i.hasNext()) {
            System.out.print(i.next() +" ");
        }
        System.out.println();
        // 7 sort the elements with the help of treeset
        Set<String> sortedSet = new TreeSet<>(p);
        System.out.println("Sorted set: "+ sortedSet);
        // 8 remove all the elements from the set
        p.clear();
        System.out.println("After clearing: " +p);
        // 9 check if the set is empty or not
        System.out.println("p is empty? "+ p.isEmpty());
    }
}
