import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть нижню межу (a): ");
        double a = scanner.nextDouble();

        System.out.print("Введіть верхню межу (b): ");
        double b = scanner.nextDouble();

        System.out.print("Введіть розмір кроку: ");
        double step = scanner.nextDouble();
        Task1 task1 = new Task1();
        double leftR = task1.MethodRectangleL(a,b,step);
        double rightR = task1.MethodRectangleR(a,b,step);
        double mediumR = task1.MethodRectangleM(a,b,step);
        double TrapM = task1.TrapezoidMethod(a,b,step);
        double SimpM = task1.SimpsonMethod(a,b,step);
        System.out.println("Result RectangleL:" + leftR);
        System.out.println("Result RectangleR:" + rightR);
        System.out.println("Result RectangleM:" + mediumR);
        System.out.println("Result Trapezoid:" + TrapM);
        System.out.println("Result Simpson:" + SimpM);
        scanner.close();
    }
}