import java.util.*;

class L5P2 {
    public static void main(String[] args) throws UserException{
        Scanner s = new Scanner(System.in);

            int x = s.nextInt();
            UserException.Excheck(x);
    }
}

import java.util.*;

class UserException extends Exception {
    public static void Excheck(int x) throws UserException {
        if (x < 18)
            throw new UserException();
        else
            System.out.println("Exception Not Occurred");
    }
}

