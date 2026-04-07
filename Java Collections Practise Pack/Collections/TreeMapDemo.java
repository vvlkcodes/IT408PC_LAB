// Problem 11
// TreeMap 
import java.util.*;

public class TreeMapDemo {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);

        TreeMap<Long, String> map = new TreeMap<>();
        int n = 1;

        System.out.println("You can follow the below listed commands to manipulate the map: ");
        System.out.println("SET t value");
        System.out.println("GET t");
        System.out.println("BETWEEN a b");
        System.out.println("");

        do {
            System.out.println("Enter 1 to pass command, Enter 0 to Exit: ");
            n = s.nextInt();
            if (n == 0) break;

            s.nextLine();
            System.out.println("Please Enter The Command: ");
            String str = s.nextLine();

            String[] strArr = str.split(" ", 3); // important (value may contain spaces)
            String command = strArr[0];

            switch (command) {

                case "SET":
                    long z = Long.parseLong(strArr[1]);
                    String value = strArr[2];
                    map.put(z, value);
                    System.out.println("Set value at time " + z);
                    break;

                case "GET":
                    z = Long.parseLong(strArr[1]);
                    Map.Entry<Long, String> entry = map.floorEntry(z);

                    if (entry == null) {
                        System.out.println("NONE");
                    } else {
                        System.out.println(entry.getValue());
                    }
                    break;

                case "BETWEEN":
                    long a = Long.parseLong(strArr[1]);
                    long b = Long.parseLong(strArr[2]);

                    int count = map.subMap(a, true, b, true).size();
                    System.out.println("Count in range [" + a + ", " + b + "] is: " + count);
                    break;

                default:
                    System.out.println("Please pass a valid command!");
            }

        } while (n != 0);

        System.out.println("The End");
    }
}