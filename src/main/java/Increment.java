public class Increment {
    public static void main(String[] args) {
        int Homer = 40;

        /* в1. вывод на прибавление 1 единицы (т.е. 40 + 1)
        ++ Homer;
        System.out.println(Homer); */

        /* в2. вывод на прибавление 1 единицы (т.е. 40 + 1)
        System.out.println(++Homer); */

        /* в3. постинкремент. сначала выводится число, а потом уже происходит сложение.
        для вывода итогового числа нужно вывести строчку еще раз
        System.out.println(Homer++);
        System.out.println(Homer);
         */

        /* в4. для прибавления (и пр.) любого числа кроме 1, исп следующее:
        Homer = Homer + 5;
        System.out.println(Homer);
        */

        /* в5. для прибавления и -, *, /
        Homer += 5;
        System.out.println(Homer);
        */

    }
}
