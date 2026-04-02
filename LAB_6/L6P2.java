// L6P2

import java.util.PriorityQueue;
import java.util.Iterator;

class PQDemo{
	public static void main(String...args){
		// 1
		PriorityQueue<String> p = new PriorityQueue<>();
		// 2 Check if the p is empty or not?
        System.out.println("Is the PriorityQueue empty? " + p.isEmpty());
        // 3 add any 5 colors (elements) to the p
        p.add("Black");
        p.add("Brown");
        p.add("Blue");
        p.add("Red");
        p.add("Orange");
        System.out.println(p);
        // 4 remove the 4th index element
        p.remove("Red");
        // 5 print all the elements of the p
        System.out.println(p);
        // 7 use iterator to print all the elements of the p
        Iterator<String> i = p.iterator();
        System.out.print("Elements using iterator: ");
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();
        // 8 print out the top most element of the p
        System.out.println("Top most element in the p: " + p.peek());
        // 6 sort
        System.out.println("P after sorting: ");
        for(int x=0;x<p.size();x++){
            System.out.print(p.poll()+" ");
        }
        // 9 remove all the elements of the p
        p.clear();
        System.out.println(p);
        // 10 check if p is empty or not 
        System.out.println("p is empty? " + p.isEmpty());

	}
}
