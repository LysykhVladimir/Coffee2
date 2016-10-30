package ru.edu.bsu.knit.lvv;
import ru.edu.bsu.knit.lvv.Tea;

/**
 * Created by Vladimir on 25.10.2016.
 */
//Пакетированный чай
abstract class BagTea extends Tea {
    private Integer bagsCount; //количество чайных пакетиков


    public BagTea(String country, Double weight, Double cost, Integer count, String teaType, Integer bagsCount) {
        super(country, weight, cost, count, teaType);
        this.bagsCount = bagsCount;
    }

    public Integer getBagsCount() {
        return bagsCount;
    }
}
