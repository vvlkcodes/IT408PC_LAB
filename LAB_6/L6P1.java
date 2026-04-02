// L6P1

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class ADDemo {
    public static void main(String... args) {

        // 1 Create the object of ArrayDeque (ad)
        ArrayDeque<String> ad = new ArrayDeque<>();
        // 2 Check if the ad is empty or not?
        System.out.println("Is the ArrayDeque empty? " + ad.isEmpty());
        // 3 add any 5 colors (elements) to the ad
        ad.add("Black");
        ad.add("Brown");
        ad.add("Blue");
        ad.add("Red");
        ad.add("Orange");
        System.out.println(ad);
        // 4 remove the 4th index element
        ad.remove("Red");
        // 5 print all the elements of the ad
        System.out.println(ad);

        // 6 sort the elements using the comparator class
        ArrayList<String> list = new ArrayList<>(ad);

        Collections.sort(list, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.compareTo(b); 
            }
        });

        ad.clear();
        ad.addAll(list);

        System.out.println("After sorting: " + ad);
        // 7 use iterator to print all the elements of the ad
        Iterator<String> i = ad.iterator();
        System.out.print("Elements using iterator: ");
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();
        // 8 print out the top most element of the ad
        System.out.println("Top most element in the ad: " + ad.peek());
        // 9 remove all the elements of the ad
        ad.clear();
        System.out.println(ad);
        // 10 check if ad is empty or not 
        System.out.println("ad is empty? " + ad.isEmpty());
    }
}
