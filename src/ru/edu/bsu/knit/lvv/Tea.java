package ru.edu.bsu.knit.lvv;
import ru.edu.bsu.knit.lvv.Product;
/**
 * Created by Vladimir on 25.10.2016.
 */
//Чай
class Tea extends Product {
    String teaType; //тип чая

    public Tea(String country, Double weight, Double cost, String teaType) {
        super(country, weight, cost);
        this.teaType = teaType;
    }
}
