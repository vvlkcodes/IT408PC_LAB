// Problem 9
// HashMap

import java.util.*;

public class HashMapDemo {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);

        HashMap<String, Integer> hits = new HashMap<>();
        int n = 1;

        System.out.println("You can follow the below listed commands to manipulate the map: ");
        System.out.println("HIT userId");
        System.out.println("RESET userId");
        System.out.println("GET userId");
        System.out.println("TOP");
        System.out.println("");

        do {
            System.out.println("Enter 1 to pass command, Enter 0 to Exit: ");
            n = s.nextInt();
            if (n == 0) break;

            s.nextLine();
            System.out.println("Please Enter The Command: ");
            String str = s.nextLine();

            String[] strArr = str.split(" ");
            String command = strArr[0];

            switch (command) {

                case "HIT":
                    String user1 = strArr[1];
                    hits.put(user1, hits.getOrDefault(user1, 0) + 1);
                    break;

                case "RESET":
                    String user2 = strArr[1];
                    hits.remove(user2);
                    break;

                case "GET":
                    String user3 = strArr[1];
                    System.out.println(hits.getOrDefault(user3, 0));
                    break;

                case "TOP":
                    if (hits.isEmpty()) {
                        System.out.println("EMPTY");
                        break;
                    }

                    String topUser = "";
                    int maxHits = -1;

                    for (Map.Entry<String, Integer> entry : hits.entrySet()) {
                        String user = entry.getKey();
                        int count = entry.getValue();

                        if (count > maxHits) {
                            maxHits = count;
                            topUser = user;
                        } 
                        else if (count == maxHits && user.compareTo(topUser) < 0) {
                            topUser = user;
                        }
                    }

                    System.out.println(topUser);
                    break;

                default:
                    System.out.println("Please pass a valid command!");
            }

        } while (n != 0);

        System.out.println("The End");
    }
}