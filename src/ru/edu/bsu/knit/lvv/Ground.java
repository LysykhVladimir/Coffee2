package ru.edu.bsu.knit.lvv;
import ru.edu.bsu.knit.lvv.Coffee;
/**
 * Created by Vladimir on 25.10.2016.
 */
//Молотый кофе
class Ground extends Coffee {
    Integer grindSize; //величина помола

    public Ground(String country, Double weight, Double cost, String grade, Integer roast, Integer grindSize) {
        super(country, weight, cost, grade, roast);
        this.grindSize = grindSize;
    }
}
