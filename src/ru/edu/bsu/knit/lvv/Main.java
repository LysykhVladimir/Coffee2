package ru.edu.bsu.knit.lvv;

public class Main {

    public static void main(String[] args) {
	    BeanCoffee ob1 = new BeanCoffee("Brazil",0.25,175.5,10,"Arabic",Roast.SMALL,3);
        System.out.println("Страна производитель: "+ob1.getCountry());
        System.out.println("Вес : "+ob1.getWeight());
        System.out.println("Цена : "+ob1.getCost());
        System.out.println("Количество : "+ob1.getCount());
        System.out.println("Сорт кофе : "+ob1.getGrade());
        System.out.println("Степень обжарки: "+ob1.getRoast());
        System.out.println("Размер зерна: "+ob1.getBeanSize());
        System.out.println("Итоговая цена: "+ob1.finalPrice());

    }
}
