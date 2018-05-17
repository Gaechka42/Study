import java.util.Random;

public class RuletkaMassiv {
    public static void main(String[] args) {
        Random roulette = new Random();

        int num [] = new int[33];

        for (int i=0; i<1000; i++) {
            ++num [roulette.nextInt(33)];
        }
        System.out.println("Номер\tЧисло");

        for (int i=0; i<num.length; i++) {
            System.out.println(i + "\t" + num [i]);
        }
    }
}
