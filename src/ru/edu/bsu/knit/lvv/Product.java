package ru.edu.bsu.knit.lvv;
import ru.edu.bsu.knit.lvv.Coffee;
/**
 * Created by Vladimir on 25.10.2016.
 */
//Товар
 class Product {
    private String country; //страна производитель
    private Double weight; //вес
    private Double cost; //стоимость

    public Product(String country, Double weight, Double cost) {
        this.country = country;
        this.weight = weight;
        this.cost = cost;
    }

    //public abstract Double getCost();
    //public abstract boolean canBuy(Double cost);
   // public String toString();
}
