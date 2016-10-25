package ru.edu.bsu.knit.lvv;
import ru.edu.bsu.knit.lvv.Tea;

/**
 * Created by Vladimir on 25.10.2016.
 */
//Пакетированный чай
class BagTea extends Tea {
    Integer bagsCount; //количество чайных пакетиков


    public BagTea(String country, Double weight, Double cost, String teaType, Integer bagsCount) {
        super(country, weight, cost, teaType);
        this.bagsCount = bagsCount;
    }
}
