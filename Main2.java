import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть нижню межу (a): ");
        double a = scanner.nextDouble();

        System.out.print("Введіть верхню межу (b): ");
        double b = scanner.nextDouble();

        System.out.print("Введіть точність (ebs): ");
        double ebs = scanner.nextDouble();
        Task2 task2 = new Task2();
        try {
            double HalfD = task2.halfDivisionM(a,b,ebs);
            System.out.printf("Метод половинного ділення: x = %.6f%n", HalfD);

            double Newton = task2.NewtonM(a,b,ebs);
            System.out.printf("Метод Ньютона: x = %.6f%n", Newton);

            double Chord = task2.ChordM(a,b,ebs);
            System.out.printf("Метод хорд: x = %.6f%n", Chord);
        }catch (RuntimeException e){
            System.out.println("Помилка: " + e.getMessage());
        }
        scanner.close();

    }
}
