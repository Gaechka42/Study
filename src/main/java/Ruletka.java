// генератор случайных чисел

import java.util.Random;

public class Ruletka {
    public static void main(String[] args) {
        Random roulette = new Random();

        for (int i = 1; i < 11; i++) {
            System.out.println(roulette.nextInt(32));
        }
    }
}
