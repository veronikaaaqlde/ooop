import java.util.Scanner;
import java.lang.Math;

public class FunctionCalculator {
    public static double calculateY(double x, double a, double b) {
        double y;
        if (x <= 1) {
            y = (a * Math.pow(Math.sin(x), 2)) + Math.sqrt(x);
        } else {
            y = b * Math.exp(Math.pow(x, 2));
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение коэффициента a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение коэффициента b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();

        double y = calculateY(x, a, b);
        System.out.println("При x = " + x + ", значение y = " + y);

        scanner.close();
    }
}
