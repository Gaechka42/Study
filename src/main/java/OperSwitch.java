public class OperSwitch {
    public static void main(String[] args) {
//        int Bender = 5;

//        //  можно каждый раз перечислять так до 5, но а можно использовать оператор switch
//        if (Bender == 1) {
//            System.out.println("Это всего лишь 1");
//        }
//            if (Bender == 2) {
//            System.out.println("Это всего лишь 2");
//        }

        int Beer = 14;
        switch (Beer)
        {
            case 1:
                System.out.println("После 1 кружки пива я в полном порядке");
                break;
            case 2:
                System.out.println("После 2 кружек пива я ищу приключений");
                break;
            case 3:
                System.out.println("После 3 кружек пива приключения ищут меня");
                break;
            case 4:
                System.out.println("После 4 кружек пива я начинаю разбираться в политике");
                break;
            default:
                System.out.println("В этом мире слишком мало пива");
                break;


        }




    }


}
