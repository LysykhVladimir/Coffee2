package ru.edu.bsu.knit.lvv;
import ru.edu.bsu.knit.lvv.Coffee;
/**
 * Created by Vladimir on 25.10.2016.
 */
//Кофе в зёрнах
class Bean extends Coffee {
    Integer beanSize; //размер зерна

    public Bean(String country, Double weight, Double cost, String grade, Integer roast, Integer beanSize) {
        super(country, weight, cost, grade, roast);
        this.beanSize = beanSize;
    }
}
