// одномерный массив. выводим количество дней в каждом месяце в году

public class Array {
    public static void main(String[] args) {
        int month_days [] ;
        month_days = new int [12];
        month_days [0] = 31;
        month_days [1] = 28;
        month_days [2] = 31;
        month_days [3] = 30;
        month_days [4] = 31;
        month_days [5] = 30;
        month_days [6] = 31;
        month_days [7] = 31;
        month_days [8] = 30;
        month_days [9] = 31;
        month_days [10] = 30;
        month_days [11] = 31;

        // или вместо "долгих" столбцов можно сделать так:
        // int month_days [] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
        System.out.println("В апреле " + month_days [3] + " дней");

        /*
        String heroes [] = {"Рик", "Морти", "Лила"}
        for (int i=0; i<2; i++)
        System.out.println (heroes [i]);

        вывод их подряд в столбик
         */
    }
}
