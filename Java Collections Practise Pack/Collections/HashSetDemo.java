// Problem 6
// HashSet 

import java.util.*;

public class HashSetDemo {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of session IDs:");
        int n = s.nextInt();
        s.nextLine();

        HashSet<String> seen = new HashSet<>();

        String duplicate = "-1";

        System.out.println("Enter session IDs:");

        for (int i = 0; i < n; i++) {
            String id = s.nextLine();

            if (seen.contains(id)) {
                duplicate = id;
                break;
            } else {
                seen.add(id);
            }
        }

        System.out.println(duplicate);
    }
}