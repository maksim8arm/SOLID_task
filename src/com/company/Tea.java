package com.company;

//Open Closed Principle - расширяем функциональность класса Tea
// не изменяя его кода, добавляем новый класс Iinfo реализации
//Interface Segregation Principle - вместо одного громоздкого
// интерфейса применяем логически независимые интерфейсы
public class Tea extends Goods implements Iinfo, Delivery {
    private Types type = Types.DRINK;
    private String name = "Sencha";
    private int price = 80;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void infoGoods() {
        System.out.println("ECO");
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public void goodsDelivery() {
        System.out.println("доставка возможна сегодня");
    }
}
