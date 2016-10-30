package ru.edu.bsu.knit.lvv;
import ru.edu.bsu.knit.lvv.Product;
/**
 * Created by Vladimir on 25.10.2016.
 */
//Кофе
 abstract class Coffee extends Product{
    private String grade;  //сорт кофе
    private Roast roast; //степень обжарки

    public Coffee(String country, Double weight, Double cost, Integer count, String grade, Roast roast) {
        super(country, weight, cost, count);
        this.grade = grade;
        this.roast = roast;
    }


    public String getGrade() {
        return grade;
    }

    public Roast getRoast() {
        return roast;
    }
}

 enum Roast{
    SMALL,
    MIDDLE,
    HARD;
 }