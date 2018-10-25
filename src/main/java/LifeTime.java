// срок действия переменной
// (действие в своем блоке кода)
public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            //переменная у инициализируется при каждом вхождении в блок кода
            int y = -1;
            // здесь всегда выводится значение -1
            System.out.println("y равно: " + y);
            y = 100;
            System.out.println("y теперь равно: " + y);
        }
    }
}

