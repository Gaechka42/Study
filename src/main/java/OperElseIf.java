public class OperElseIf {
    public static void main(String[] args) {
        int Homer;
        Homer = 110;
        if (Homer>115) {
            System.out.println("Идеальный вес");
        }
        else if (Homer>111){
            System.out.println("супер идеальный вес");
        }
        else if (Homer<118) {
            System.out.println("вес практически идеален");
        }
        else {
            System.out.println("иди еще поешь");
        }
    }
}
