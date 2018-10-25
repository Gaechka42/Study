// вывод текста с консоли на экран вместо сканера
import java.io.*;

public class Solution3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String chislo1 = reader.readLine();
        String chislo2 = reader.readLine();

        System.out.println(name + " получает " + chislo1 + " через " + chislo2 + " лет.");
    }
}