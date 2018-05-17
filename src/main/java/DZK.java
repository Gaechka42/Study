class DZK {
    public static void main(String[] args) {

        int kir[][] = new int[5][5];
        int i, j, k = 0;

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                kir[i][j] = k;
                k++;
                kir [i][j] = (int) (Math.random() * 9);
                System.out.print(kir[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (i = 0; i < 5; i++) {
            sum = sum + kir [i][i];
        }
        System.out.println("Сумма главной диагонали = " + sum);

        int sum2 = 0;
        for (i = 0; i < 5; i++) {
            sum2 = sum2 + kir [5 - i - 1][i];
        }
        System.out.println("Сумма побочной диагонали - " + sum2);

    }
}



