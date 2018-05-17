// математические операции
public class MathOperations {
    public static void main(String[] args) {
        double cups, plates, dishes;
        cups = 14;
        plates = 4;
        dishes = cups % plates;
        // можно ставить любой знак арифметической операции (=,-,*,/,%)
        // знак % возвращает остаток от деления.
        // в примере 14/4 = 3,5.
        // но при 3*4=12, а не 14. остаток = 2.

        System.out.println(dishes);
    }

}
