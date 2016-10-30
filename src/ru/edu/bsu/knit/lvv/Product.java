package ru.edu.bsu.knit.lvv;
import ru.edu.bsu.knit.lvv.Coffee;
/**
 * Created by Vladimir on 25.10.2016.
 */
//Товар
  abstract class Product implements MakeMoney {
    private String country; //страна производитель
    private Double weight; //вес
    private Double cost; //стоимость за единицу наименования
    private Integer count; //количество

    public Product(String country, Double weight, Double cost, Integer count) {
        this.country = country;
        this.weight = weight;
        this.cost = cost;
        this.count = count;
    }

    public String getCountry() {
        return country;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getCost() {
        return cost;
    }

    public Integer getCount() {
        return count;
    }

    public Double totalCost(){
        return count*cost; //общая стоимость товара
    }

}
