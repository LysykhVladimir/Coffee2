package ru.edu.bsu.knit.lvv;

/**
 * Created by Vladimir on 30.10.2016.
 */
public interface MakeMoney {
    Double totalCost(); //общая стоимость
    Double discount(); //скидка
    Double finalPrice(); //окончательная стоимость с учётом скидки
}