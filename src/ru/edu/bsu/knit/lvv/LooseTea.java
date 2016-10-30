package ru.edu.bsu.knit.lvv;
import ru.edu.bsu.knit.lvv.Tea;
/**
 * Created by Vladimir on 25.10.2016.
 */
//Рассыпной чай
abstract class LooseTea extends Tea{
    private String leafCategory; //категория чайного листа


    public LooseTea(String country, Double weight, Double cost, Integer count, String teaType, String leafCategory) {
        super(country, weight, cost, count, teaType);
        this.leafCategory = leafCategory;
    }

    public String getLeafCategory() {
        return leafCategory;
    }
}
