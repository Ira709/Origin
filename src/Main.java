import java.util.Random;


public class Main {

    // This is new branch
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello number = " + calc(i, new Random().nextInt()));
        }
    }

    static int calc(int a, int b) {
        if (a > b) {
            return a * b;
        } else if (b > 0) {
            return a / b;
        }
        return 0;
    }
}