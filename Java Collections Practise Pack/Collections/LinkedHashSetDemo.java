// Problem 8
// LinkedHashSet 

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter capacity N:");
        int cap = s.nextInt();
        s.nextLine();

        LinkedHashSet<String> recents = new LinkedHashSet<>();

        int n = 1;

        System.out.println("Commands:");
        System.out.println("SEARCH term");
        System.out.println("");

        do {
            System.out.println("Enter 1 to pass command, Enter 0 to Exit: ");
            n = s.nextInt();
            if (n == 0) break;

            s.nextLine();
            System.out.println("Please Enter The Command: ");
            String str = s.nextLine();

            String[] strArr = str.split(" ", 2); // important
            String command = strArr[0];

            switch (command) {

                case "SEARCH":
                    String term = strArr[1];

                    // If exists → remove first
                    if (recents.contains(term)) {
                        recents.remove(term);
                    }

                    // Add to end (most recent)
                    recents.add(term);

                    // Maintain capacity
                    if (recents.size() > cap) {
                        Iterator<String> it = recents.iterator();
                        String oldest = it.next();
                        it.remove();
                    }

                    break;

                default:
                    System.out.println("Please pass a valid command!");
            }

        } while (n != 0);

        // Final Output
        System.out.println("Final Recent Searches (Oldest → Newest):");
        for (String x : recents) {
            System.out.print(x + " ");
        }

        System.out.println("\nThe End");
    }
}