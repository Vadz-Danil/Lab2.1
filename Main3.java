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

        double x = x0;
        double y = y0;

        System.out.println("\nРезультати обчислень:");
        for (double i = x0 + h ; i <= xn + 1e-10 ; i += h) {
            y = solver.RangeKutta2(x, i, y, h);
            x = i;
            System.out.printf("При x = %.2f, y = %.6f%n", x, y);
        }

        scanner.close();
    }
}
