public class OverloadDemo {
    void  test () {
        System.out.println("Параметры отсутствуют");
    }
    // перегружаемый метод, проверяющий наличие
    //одного целочисленного параметра
    void test (int a) {
        System.out.println("a: " + a);
    }
    //перегружаемый метод, проверяющий наличие
    //двух целочисленных параметров
    void test (int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }
    // перегружаемый метод, проверяющий наличие
    // параметра типа double
    double test (double a) {
        System.out.println("double a: " + a);
        return  a*a;
    }
}
