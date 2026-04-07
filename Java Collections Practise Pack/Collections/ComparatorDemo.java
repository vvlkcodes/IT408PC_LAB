// Problem 12
// Comparator

import java.util.*;

// Candidate class
class Candidate {
    String name;
    int yearsExp;
    int score;

    Candidate(String name, int yearsExp, int score) {
        this.name = name;
        this.yearsExp = yearsExp;
        this.score = score;
    }
}

public class ComparatorDemo {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of candidates:");
        int n = s.nextInt();
        s.nextLine();

        ArrayList<Candidate> list = new ArrayList<>();

        System.out.println("Enter candidate details (name yearsExp score):");

        for (int i = 0; i < n; i++) {
            String str = s.nextLine();
            String[] strArr = str.split(" ");

            String name = strArr[0];
            int yearsExp = Integer.parseInt(strArr[1]);
            int score = Integer.parseInt(strArr[2]);

            list.add(new Candidate(name, yearsExp, score));
        }

        // Comparator
        Comparator<Candidate> cmp = Comparator
                .comparingInt((Candidate c) -> c.score).reversed()
                .thenComparing((Candidate c) -> c.yearsExp, Comparator.reverseOrder())
                .thenComparing(c -> c.name);

        // Sort
        list.sort(cmp);

        System.out.println("Sorted Candidates:");

        for (Candidate c : list) {
            System.out.println(c.name + " " + c.yearsExp + " " + c.score);
        }
    }
}