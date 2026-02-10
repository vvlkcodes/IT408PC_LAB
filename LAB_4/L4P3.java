import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class L4P3 {
    public static void main(String[] args) throws IOException {

        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader st = new BufferedReader(str);

        try {
            int x = Integer.parseInt(st.readLine());
            int y = Integer.parseInt(st.readLine());
            System.out.println(x / y);
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}
