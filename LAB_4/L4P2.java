import java.util.Scanner;
import java.util.*;

class L4P2 {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        try {
            int n = Integer.parseInt("lalith");
            int m = s.nextInt();
            System.out.println(n / m);
        } catch (InputMismatchException ie) {
            System.out.println("X");
            System.out.println(ie.getMessage());
        } catch (ArithmeticException ia) {
            System.out.println("Y");
            System.out.println(ia.getMessage());
        } catch (Exception e) {
            System.out.println("E");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Exception Handled");
        }
    }
}
