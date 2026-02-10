
import java.util.*;

class UserException1 extends Exception {
    String s;
    UserException1(){}
    public UserException1(String s){
        this.s = s;
        System.out.println(s);
    }

    public static void Excheck(int x) throws UserException1 {
        if ((x & 1) != 0)
            throw new UserException1("Odd Number Exception");
        else
            System.out.println("Exception Not Occurred");
    }
}

class L4P5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            int x = s.nextInt();
            UserException1.Excheck(x);
        } catch (UserException1 e) {
            System.out.println("Handled");
        }
    }
}
