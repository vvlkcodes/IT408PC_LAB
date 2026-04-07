// Problem 2
// LinkedList - Queue with VIP
// Implemention of the Deque with the help of the LinkedList

import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class LinkedListDemo {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);

        Deque<Integer> list = new LinkedList<>();
        int n;

        System.out.println("You can follow the below commands to manipulate the linked LinkedList:");
        System.out.println("VIP X");
        System.out.println("NORMAL X");
        System.out.println("SERVE");
        System.out.println("PEEK");
        System.out.println("CANCEL_LAST");
        System.out.println("SIZE");

        do {
            System.out.println("Enter 1 to continue, 0 to exit:");
            n = s.nextInt();
            if (n == 0) break;

            s.nextLine();
            System.out.println("Enter command:");
            String str = s.nextLine();
            String[] strArr = str.split(" ");
            String command = strArr[0];

            switch (command) {

                case "VIP":
                    int z1 = Integer.parseInt(strArr[1]);
                    list.addFirst(z1);
                    break;

                case "NORMAL":
                    int z2 = Integer.parseInt(strArr[1]);
                    list.addLast(z2);
                    break;

                case "SERVE":
                    Integer served = list.pollFirst();
                    System.out.println(served == null ? "EMPTY" : served);
                    break;

                case "PEEK":
                    Integer front = list.peekFirst();
                    System.out.println(front == null ? "EMPTY" : front);
                    break;

                case "CANCEL_LAST":
                    list.pollLast();
                    break;

                case "SIZE":
                    System.out.println(list.size());
                    break;

                default:
                    System.out.println("Invalid command!");
            }

        } while (n != 0);

        System.out.println("The End");
    }
}