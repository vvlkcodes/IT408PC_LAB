// Problem 14
// Mixed Collections - Log Aggregator

import java.util.*;

public class MixedCollectionsDemo {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);

        HashSet<String> seenEventIds = new HashSet<>();
        HashMap<String, ArrayList<Integer>> serviceMap = new HashMap<>();
        TreeMap<Long, Integer> tsCounts = new TreeMap<>();

        int n = 1;

        System.out.println("Commands:");
        System.out.println("INGEST eventId timestamp service latency");
        System.out.println("TOPK service k");
        System.out.println("COUNT a b");
        System.out.println("");

        do {
            System.out.println("Enter 1 to pass command, Enter 0 to Exit:");
            n = s.nextInt();
            if (n == 0) break;

            s.nextLine();
            System.out.println("Enter command:");
            String str = s.nextLine();

            String[] strArr = str.split(" ");
            String command = strArr[0];

            switch (command) {

                case "INGEST":
                    String eventId = strArr[1];
                    long ts = Long.parseLong(strArr[2]);
                    String service = strArr[3];
                    int latency = Integer.parseInt(strArr[4]);

                    // 1. Deduplication
                    if (seenEventIds.contains(eventId)) break;
                    seenEventIds.add(eventId);

                    // 2. Store latency per service
                    serviceMap.putIfAbsent(service, new ArrayList<>());
                    serviceMap.get(service).add(latency);

                    // 3. Timestamp count
                    tsCounts.put(ts, tsCounts.getOrDefault(ts, 0) + 1);

                    break;

                case "TOPK":
                    String srv = strArr[1];
                    int k = Integer.parseInt(strArr[2]);

                    if (!serviceMap.containsKey(srv)) {
                        System.out.println("NONE");
                        break;
                    }

                    ArrayList<Integer> list = new ArrayList<>(serviceMap.get(srv));

                    // sort descending
                    Collections.sort(list, Collections.reverseOrder());

                    int limit = Math.min(k, list.size());

                    for (int i = 0; i < limit; i++) {
                        System.out.print(list.get(i) + " ");
                    }
                    System.out.println();

                    break;

                case "COUNT":
                    long a = Long.parseLong(strArr[1]);
                    long b = Long.parseLong(strArr[2]);

                    int count = 0;

                    for (int val : tsCounts.subMap(a, true, b, true).values()) {
                        count += val;
                    }

                    System.out.println(count);
                    break;

                default:
                    System.out.println("Invalid command!");
            }

        } while (n != 0);

        System.out.println("The End");
        s.close();
    }
}