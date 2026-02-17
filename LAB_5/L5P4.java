import java.lang.reflect.Method;
import java.lang.annotation.*;

class L5P4 {

    @Bullet1(str="lalith", dbl=12.1245)
    public static void anyMethod() {
        try {
            Method mtd = L5P4.class.getMethod("anyMethod");  // Fixed here
            Bullet1 b = mtd.getAnnotation(Bullet1.class);

            System.out.println("String... " + b.str());
            System.out.println("Double... " + b.dbl());

        } catch (NoSuchMethodException e) {
            System.out.println("Method not found: " + e.getMessage());
        }
    }

    public static void main(String... args) {
        anyMethod();
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Bullet1 {
    String str();
    double dbl();
}
