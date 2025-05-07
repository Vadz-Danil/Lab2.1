import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task3 solver = new Task3();

        System.out.println("Введіть початкове значення x0:");
        double x0 = scanner.nextDouble();

        System.out.println("Введіть кінцеве значення xn:");
        double xn = scanner.nextDouble();

        System.out.println("Введіть початкове значення y0:");
        double y0 = scanner.nextDouble();

        System.out.println("Введіть крок h:");
        double h = scanner.nextDouble();

        double result = solver.RangeKutta2(x0, xn, y0, h);

        System.out.println("\nРезультати обчислень:");
        System.out.printf("При x = %.2f, y = %.6f%n", xn, result);

        scanner.close();
    }
}
