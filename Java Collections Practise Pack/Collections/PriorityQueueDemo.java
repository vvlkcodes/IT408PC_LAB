// Problem 5
// PriorityQueue 

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter n and k:");
        int n = s.nextInt();
        int k = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter error codes:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // 1. Frequency map
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // 2. Min-heap (size at most k)
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a[1] == b[1]) {
                    return b[0] - a[0]; // code desc (worse first)
                }
                return a[1] - b[1]; // freq asc
            }
        );

        // 3. Push into heap
        for (int key : map.keySet()) {
            pq.offer(new int[]{key, map.get(key)});
            if (pq.size() > k) {
                pq.poll(); // remove worst
            }
        }

        // 4. Extract results
        List<int[]> list = new ArrayList<>();

        while (!pq.isEmpty()) {
            list.add(pq.poll());
        }

        // 5. Sort final answer
        Collections.sort(list, (a, b) -> {
            if (b[1] == a[1]) {
                return a[0] - b[0]; // code asc
            }
            return b[1] - a[1]; // freq desc
        });

        // 6. Print result
        System.out.println("Top K Frequent Codes:");
        for (int[] x : list) {
            System.out.print(x[0] + " ");
        }

        s.close();
    }
}