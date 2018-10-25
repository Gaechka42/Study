public class ForEachRasshirrennii {
    public static void main(String[] args) {
        int beer [] = {1, 2, 3, 4};
        int sum = 0;

        // в такой схеме переменна i берет каждое значение по очереди и суммирует их
        for (int i:beer) {
            sum += i;
        }
        System.out.println(sum);
    }
}
