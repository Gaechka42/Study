import java.util.Scanner;

        //было в курсе
//        double vklad = 30000;
//                double procent = 0.06;
//
//                for (int year = 1; year <= 10; year++) {
//                vklad+=vklad*procent;
//                System.out.println("За " + year + " год вам начислено " + vklad + " процентов со вклада");


public class VkladProcent {
    public static void main(String[] args) {
        Scanner Sberezheniya = new Scanner(System.in);
        double vklad, procent, vznos;

        System.out.println("Введите сумму первоначального взноса: ");
        vklad = Sberezheniya.nextDouble();

        System.out.println("Введите число процента годовых (в формате 0,00): ");
        procent = Sberezheniya.nextDouble();

        System.out.println("Введите сумму ежемесячного взноса: ");
        vznos = Sberezheniya.nextDouble();


        for (int year = 1; year <= 10; year++) {
            vklad+=vklad*procent+vznos*12;
            System.out.println("За " + year + " год вам начислено " + vklad + " процентов со вклада");
        }
    }
}
