package ru.edu.bsu.knit.lvv;
import ru.edu.bsu.knit.lvv.Coffee;
/**
 * Created by Vladimir on 25.10.2016.
 */
//Молотый кофе
abstract class GroundCoffee extends Coffee {
    private Integer grindSize; //величина помола

    public GroundCoffee(String country, Double weight, Double cost, Integer count, String grade, Roast roast, Integer grindSize) {
        super(country, weight, cost, count, grade, roast);
        this.grindSize = grindSize;
    }

    public Integer getGrindSize() {
        return grindSize;
    }
}
