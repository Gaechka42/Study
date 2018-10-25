class DZK {
    public static void main(String[] args) {

        int size = (int) (Math.random() * 9);
        int kir[][] = new int[size][size];
        int i, j, k = 0;

        int sum = 0;
        int sum2 = 0;

        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                kir[i][j] = k;
                k++;
                kir [i][j] = (int) (Math.random() * 9);
                System.out.print(kir[i][j] + " ");
                sum = sum + kir [i][i];
                sum2 = sum2 + kir [size - i - 1][i];
            }
            System.out.println();
        }
//        int sum = 0;
//        for (i = 0; i < size; i++) {
//            sum = sum + kir [i][i];
//        }


//        int sum2 = 0;
//        for (i = 0; i < size; i++) {
//            sum2 = sum2 + kir [size - i - 1][i];
//        }

        int sum3 = sum + sum2;
        System.out.println("Сумма главной диагонали = " + sum);
        System.out.println("Сумма побочной диагонали = " + sum2);
        System.out.println("Сумма диагоналей = " + sum3);
    }
}


