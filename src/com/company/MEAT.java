package com.company;

//Single Responsibility Principle - класс MEAT и др. классы которые
// расширяют класс Goods описывает только определенный товар
// с разными дополнениями которых нет в классе Goods
public class MEAT extends Goods {
    private Types type = Types.MEAT;
    private String name = "Баранина";
    private int price = 200;

    @Override
    public Types getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

}
