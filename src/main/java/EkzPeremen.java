public class EkzPeremen {
    private String movieName;

// пробуем на этой проге конструктор
    public EkzPeremen (String name) {
        movieName = name;
    }
    public void setName (String name) {
        movieName = name;
    }
    public String getName () {
        return movieName;
    }
    public void output (){
        System.out.printf("Твой любимый фильм - %s", getName());
        System.out.println();
    }




//    прога на вывод любимого фильма

//    public void setName (String name) {
//        movieName = name;
//    }
//    public String getName () {
//        return movieName;
//    }
//    public void output (){
//        System.out.printf("Твой любимый фильм - %s", getName());
//    }
}
