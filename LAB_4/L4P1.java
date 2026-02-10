import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.ArithmeticException;

class L4P1 {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        try {
            int n = s.nextInt();
            int m = s.nextInt();
            System.out.println(n / m);
        } catch (InputMismatchException ie) {
            System.out.println("X");
            System.out.println(ie.getMessage());
        } catch (ArithmeticException ia) {
            System.out.println("Y");
            System.out.println(ia.getMessage());
        } finally {
            System.out.println("Exception Handled");
        }
    }
}
