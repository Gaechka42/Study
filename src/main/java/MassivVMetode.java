public class MassivVMetode {
    public static void main(String[] args) {
        String heroes [] = {"Эми", "Мегги", "Лила", "Лоис"};
        title(heroes);

        for (String i:heroes) {
            System.out.println(i);
        }
    }
    public static void title (String t []) {
        for (int i = 0; i < t.length; i++) {
            t[i] += " - та еще штучка";
        }
    }
}
