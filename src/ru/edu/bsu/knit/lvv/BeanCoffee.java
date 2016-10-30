package ru.edu.bsu.knit.lvv;
import ru.edu.bsu.knit.lvv.Coffee;
/**
 * Created by Vladimir on 25.10.2016.
 */
//Кофе в зёрнах
class BeanCoffee extends Coffee {
    private Integer beanSize; //размер зерна

    public BeanCoffee(String country, Double weight, Double cost, Integer count, String grade, Roast roast, Integer beanSize) {
        super(country, weight, cost, count, grade, roast);
        this.beanSize = beanSize;
    }

    public Integer getBeanSize() {
        return beanSize;
    }
    public Double discount(){
        Double productCost = 1.0;
        if(this.getCount()>=3) {
            productCost-=0.3;
            return productCost;
        }
        else
        {
            return productCost;
        }
    }

    public Double finalPrice(){
      return this.totalCost()*this.discount();
    }
}
