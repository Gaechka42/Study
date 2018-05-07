import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner Calculator = new Scanner(System.in);

        // fn - first number, sn - second number
        double fn, sn, result;

        System.out.println("Введите первое число: ");
        fn = Calculator.nextDouble();
        System.out.println("Введите второе число: ");
        sn = Calculator.nextDouble();

        result = fn + sn;

        System.out.println("Сумма равна: " + result);
    }
}
