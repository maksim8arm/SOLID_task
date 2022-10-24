package com.company;

public class Milk extends Goods implements Iinfo {
    private Types type = Types.DAIRY_GOODS;
    private String name = "Milka";
    private int price = 50;
    private double percentFat = 3.2;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public double getPercentFat() {
        return percentFat;
    }

    @Override
    public void infoGoods() {
        System.out.println("Наше молоко без добавления растительных жиров");
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}
