public class TablMass {
    public static void main(String[] args) {
        System.out.println("Поз\tЗнач");
        String animals [] = {"еж", "лис", "пес", "уж"};

        for (int i = 0; i<animals.length; i++) {
            System.out.println(i + "\t" +animals[i]);
        }
    }
}


/*
т.е. 23 + 3 + 4 + 5 = 35

public static void main(String[] args) {
        System.out.println("Поз\tЗнач");
        String animals [] = {23, 3, 4, 5};

        int sum = 0;

        for (int i = 0; i<animals.length; i++) {
            sum += animals[i];
        }
        System.out.println("Сумма равна " + sum);
    }
 */