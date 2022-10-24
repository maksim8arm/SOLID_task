package com.company;

import java.util.List;

public class Goods {

    private Types type;
    private String name;
    private int price;

    private int quantityGoods;

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantityGoods;
    }

    public void setQuantityGoods(int quantity) {
        this.quantityGoods = quantity;
    }

    public String getName() {
        return name;
    }

    public Types getType() {
        return type;
    }

}
