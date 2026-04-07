// Problem 3
// Stack - (push, pop, peeks

import java.util.*;

public class StackDemo {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);

        StringBuilder current = new StringBuilder();
        Stack<String> stack = new Stack<>();

        int n;

        System.out.println("You can follow the below commands:");
        System.out.println("TYPE X");
        System.out.println("UNDO");
        System.out.println("PRINT");

        do {
            System.out.println("Enter 1 to continue, 0 to exit:");
            n = s.nextInt();
            if (n == 0) break;

            s.nextLine();
            System.out.println("Enter command:");
            String str = s.nextLine();

            String[] strArr = str.split(" ", 2); // important
            String command = strArr[0];

            switch (command) {

                case "TYPE":
                    String x = strArr[1];
                    current.append(x);
                    stack.push(x);
                    break;

                case "UNDO":
                    if (!stack.isEmpty()) {
                        String last = stack.pop();
                        current.delete(current.length() - last.length(), current.length());
                    }
                    break;

                case "PRINT":
                    if(stack.isEmpty()) System.out.println("The stack is empty");
                    System.out.println(current.toString());
                    break;

                default:
                    System.out.println("Invalid command!");
            }

        } while (n != 0);

        System.out.println("The End");
    }
}