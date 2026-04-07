// Problem 4
// ArrayDeque - (Sliding window max)


import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDequeDemo {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = s.nextInt();
        System.out.println("Enter the size of the window: ");
        int k = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        System.out.println("Sliding Window Maximum:");

        for (int i = 0; i < n; i++) {

            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            dq.addLast(i);

            if (i >= k - 1) {
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }
    }
}