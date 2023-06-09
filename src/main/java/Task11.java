import java.util.Objects;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();
        String result1 = Integer.toString(number1);
        System.out.println("Первое число преобразовано в строку: " + result1);

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();
        int result2 = number2;
        System.out.println("Второе число является целочисленным: " + result2);

        int result3 = Integer.parseInt(result1);
        boolean compare = Objects.equals(result2, result3);
        double minNumber = Math.min(result2, result3);

        System.out.println("Числа равны? " + compare);
        System.out.println("Наименьшим числом является " + minNumber);

    }
}

