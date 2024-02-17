import java.util.Scanner;
import java.lang.Math;

public class ExpressionSolver {
    public static void main(String[] args) {
        double a = 5.7;
        double b = 6.4;
        double c = 3.1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение x:");
        double x = scanner.nextDouble();

        double y = solveExpression(a, b, c, x);
        double roundedY = roundToTwoDecimals(y);
        System.out.println("Результат: y = " + roundedY);

        scanner.close();
    }

    public static double solveExpression(double a, double b, double c, double x) {
        double part1 = Math.sqrt(Math.exp(a * x) + x * x);
        double part2 = Math.log(x * x) + b * x + 10 * Math.sin(c * x) + 4.2;
        return part1 / part2;
    }

    public static double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
