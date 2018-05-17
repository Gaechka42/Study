// вывод последовательных чисел до определенного числа
public class ForTest {
    public static void main(String[] args) {
        int x;

        // x++ (увеличивает на один), если нудно больше, то х+=3 (увеличивает на 3)
        for (x = 0; x<=10; x+=3) {
            System.out.println("Значение x: " + x);
        }
    }
}
