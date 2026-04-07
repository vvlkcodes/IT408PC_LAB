// Problem 7
// TreeSet Demo

import java.util.*;

public class TreeSetDemo {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        int n = 1;

        System.out.println("You can follow the below listed commands to manipulate the set: ");
        System.out.println("DEPLOY X");
        System.out.println("ROLLBACK X");
        System.out.println("LATEST");
        System.out.println("EARLIEST");
        System.out.println("NEXT X");
        System.out.println("PREV X");
        System.out.println("CEIL X");
        System.out.println("FLOOR X");
        System.out.println("RANGE A B");
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
            int z;
            int x;

            switch (command) {

                case "DEPLOY":
                    z = Integer.parseInt(strArr[1]);
                    set.add(z);
                    System.out.println("Deployed version " + z);
                    break;

                case "ROLLBACK":
                    z = Integer.parseInt(strArr[1]);
                    set.remove(z);
                    System.out.println("Rolled back version " + z);
                    break;

                case "LATEST":
                    if (set.isEmpty()) {
                        System.out.println("EMPTY");
                    } else {
                        System.out.println("Latest version: " + set.last());
                    }
                    break;

                case "EARLIEST":
                    if (set.isEmpty()) {
                        System.out.println("EMPTY");
                    } else {
                        System.out.println("Earliest version: " + set.first());
                    }
                    break;

                case "NEXT":
                    z = Integer.parseInt(strArr[1]);
                    Integer next = set.higher(z);
                    System.out.println(next == null ? "NONE" : next);
                    break;

                case "PREV":
                    z = Integer.parseInt(strArr[1]);
                    Integer prev = set.lower(z);
                    System.out.println(prev == null ? "NONE" : prev);
                    break;

                case "CEIL":
                    z = Integer.parseInt(strArr[1]);
                    Integer ceil = set.ceiling(z);
                    System.out.println(ceil == null ? "NONE" : ceil);
                    break;

                case "FLOOR":
                    z = Integer.parseInt(strArr[1]);
                    Integer floor = set.floor(z);
                    System.out.println(floor == null ? "NONE" : floor);
                    break;

                case "RANGE":
                    z = Integer.parseInt(strArr[1]);
                    x = Integer.parseInt(strArr[2]);
                    int count = set.subSet(z, true, x, true).size();
                    System.out.println("Count in range [" + z + ", " + x + "] is: " + count);
                    break;

                default:
                    System.out.println("Please pass a valid command!");
            }

        } while (n != 0);

        System.out.println("The End");
    }
}