// Problem 10
// LinkedHashMap 

import java.util.*;

class LRUCache extends LinkedHashMap<Integer, Integer> {
    int cap;

    LRUCache(int cap) {
        super(cap, 0.75f, true);
        this.cap = cap;
    }

    public int get(int k) {
        return super.getOrDefault(k, -1);
    }

    public void put(int k, int v) {
        super.put(k, v);
    }

    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> e) {
        return size() > cap;
    }
}

public class LinkedHashMapDemo {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);

        int cap = s.nextInt();
        LRUCache cache = new LRUCache(cap);

        while (true) {
            String cmd = s.next();

            if (cmd.equals("EXIT")) break;

            if (cmd.equals("PUT")) {
                int k = s.nextInt();
                int v = s.nextInt();
                cache.put(k, v);
            } 
            else if (cmd.equals("GET")) {
                int k = s.nextInt();
                System.out.println(cache.get(k));
            }
        }
    }
}