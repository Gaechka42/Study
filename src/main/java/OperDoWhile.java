// оператор do while - выполняется хотя бы один раз.
// сначала выводится на экран значение в теле do
// если в while значение верно, то цикл продолжается
// если значение неверно, то цикл на этом и прекращается (на первом выводе)
public class OperDoWhile {
    public static void main(String[] args) {
        int count = 0;

        do {
            System.out.println(count);
            count++;
        }
         while (count>8);
    }
}
