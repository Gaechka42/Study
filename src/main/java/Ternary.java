public class Ternary {
    public static void main(String[] args) {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i; //получить абсолютное значение переменной
        System.out.println("абсолютное значение " + i + " равно " + k);

        i = -10;
        k=i < 0 ? -i : i; // получить абсолютное значение переменной
        System.out.println("абсолютное значение " + i + " равно " + k);
    }
}
