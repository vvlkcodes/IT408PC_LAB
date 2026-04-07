// Problem 13
// Comparable - Natural Ordering for BuildArtifact

import java.util.*;

// BuildArtifact class with Comparable
class BuildArtifact implements Comparable<BuildArtifact> {
    String service;
    int version;

    BuildArtifact(String service, int version) {
        this.service = service;
        this.version = version;
    }

    @Override
    public int compareTo(BuildArtifact other) {

        // 1. service ascending
        int cmp = this.service.compareTo(other.service);
        if (cmp != 0) return cmp;

        // 2. version descending
        return other.version - this.version;
    }
}

public class ComparableDemo {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of artifacts:");
        int n = s.nextInt();
        s.nextLine();

        TreeSet<BuildArtifact> set = new TreeSet<>();

        System.out.println("Enter service and version:");

        for (int i = 0; i < n; i++) {
            String str = s.nextLine();
            String[] strArr = str.split(" ");

            String service = strArr[0];
            int version = Integer.parseInt(strArr[1]);

            set.add(new BuildArtifact(service, version));
        }

        System.out.println("Sorted Build Artifacts:");

        for (BuildArtifact b : set) {
            System.out.println(b.service + " " + b.version);
        }

        s.close();
    }
}