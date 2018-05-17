public class ClassMath {
    public static void main(String[] args) {
        // abs показывает как далеко находится число от 0, т.е. = 51
        System.out.println(Math.abs(-51));
        // ceil округляет число до целого ВСЕГДА в большую сторону, т.е.= 3.0
        System.out.println(Math.ceil(2.1));
        // floor округляет число до целого в меньшую сторону, т.е. = 2.0
        System.out.println(Math.floor(2.1));
        // max выводит наибольшее из двух чисел, т.е. = 5.6
        System.out.println(Math.max(5.6, 4.2));
        // min выводит наименьшее из двух чисел, т.е. = 4.2
        System.out.println(Math.min(5.6, 4.2));
        // pow оператор возведения в степень, т.е. = 16 (4 во 2 степени)
        System.out.println(Math.pow(4, 2));
        // sqrt оператор извлекает корень, т.е. = 4
        System.out.println(Math.sqrt(16));
    }

}
