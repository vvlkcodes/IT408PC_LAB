import java.util.*;

class UserException1 extends Exception {
    public static void Excheck(int x) throws UserException1 {
        if ((x & 1) != 0)
            throw new UserException1();
        else
            System.out.println("Exception Not Occurred");
    }
}

class L4P4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            int x = s.nextInt();
            UserException1.Excheck(x);
        } catch (UserException1 e) {
            System.out.println("Odd number exception handled");
        }
    }
}



