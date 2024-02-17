import java.util.Scanner;

public class FunctionCalculator1 {
    public static double calculateS(double x, double a) {
        double s = 0;
        double term = 1;
        int n = 0;
        int iterations = 0;

        while (Math.abs(term) > 1e-10) {
            s += term;
            term = Math.pow(a, n) / (Math.pow(2, n / 2) * Math.cos(Math.PI * n / 4) * factorial(n));
            n++;
            iterations++;
        }

        return s;
    }

    public static double factorial(int n) {
        if (n == 0)
            return 1;
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();

        double result = calculateS(x, a);
        System.out.println("Значение функции s при x = " + x + " и a = " + a + " равно " + result);

        scanner.close();
    }
}
