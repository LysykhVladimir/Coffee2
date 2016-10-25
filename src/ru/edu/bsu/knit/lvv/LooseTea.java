package ru.edu.bsu.knit.lvv;
import ru.edu.bsu.knit.lvv.Tea;
/**
 * Created by Vladimir on 25.10.2016.
 */
//Рассыпной чай
class LooseTea extends Tea{
    String leafCategory; //категория чайного листа


    public LooseTea(String country, Double weight, Double cost, String teaType, String leafCategory) {
        super(country, weight, cost, teaType);
        this.leafCategory = leafCategory;
    }
}
