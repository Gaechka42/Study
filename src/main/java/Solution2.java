// вывести минимум их 4х чисел

public class Solution2 {
   public static int min(int a, int b, int c, int d) {
       return min(min(a, b), min(c, d));
   }

    public static int min(int a, int b) {
        int x = Math.min(a, b);
        return x;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}