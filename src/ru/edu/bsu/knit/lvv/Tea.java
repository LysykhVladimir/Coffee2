package ru.edu.bsu.knit.lvv;
import ru.edu.bsu.knit.lvv.Product;
/**
 * Created by Vladimir on 25.10.2016.
 */
//Чай
abstract class Tea extends Product {
    private String teaType; //тип чая

    public Tea(String country, Double weight, Double cost, Integer count, String teaType) {
        super(country, weight, cost, count);
        this.teaType = teaType;
    }

    public String getTeaType() {
        return teaType;
    }
}
