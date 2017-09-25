import java.util.Scanner;

public class task4_2 {
    public static int pow(int a, int b) {
        if (b > 1)
            return a * pow(a, b - 1);
        else if (b == 1)
            return a;
        else if (b == 0)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("" + a + "^" + b + " = " + pow(a, b));

    }
}
