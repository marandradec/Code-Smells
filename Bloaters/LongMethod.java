
public class LongMethod {
public void processOrder(int a, int b, int c, int d, int e, int f) {
        int total = 0;
        for (int i = 0; i < 100; i++) {
            total += i;
        }
        if (a > 0) {
            total += a;
        }
        if (b > 0) {
            total += b;
        }
        // ... muchas más líneas sin dividir responsabilidades
        System.out.println("Total: " + total);
    }
}