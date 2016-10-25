package ru.edu.bsu.knit.lvv;
import ru.edu.bsu.knit.lvv.Product;
/**
 * Created by Vladimir on 25.10.2016.
 */
//Кофе
 class Coffee extends Product{
    private String grade;  //сорт кофе
    private Integer roast; //степень обжарки

      public Coffee(String country, Double weight, Double cost, String grade, Integer roast) {
        super(country, weight, cost);
        this.grade = grade;
        this.roast = roast;
    }
}
