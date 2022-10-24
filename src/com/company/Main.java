package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Liskov substitution principle - наследники класса Goods являются в роли предка
        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Milk());
        goodsList.add(new MEAT());
        goodsList.add(new Tea());

        Buyer ivan = new Buyer("Иван", new SenderToMail());

        Scanner scanner = new Scanner(System.in);
        while (true) {
            //правило DRY - блок кода не повторяется в программе, а
            // вынесен в отдельный метод
            showGoods(goodsList);

            System.out.println("Введите номер товара и кол-во или введите `end` ");
            System.out.println(" Для фильтрации цен по возрастанию нажмите 'f'");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            int goodsNum = 0;
            if (parts.length > 1 && !(parts[0].equals("i"))) {
                goodsNum = Integer.parseInt(parts[0]) - 1;
            }
            if ("f".equals(input)) {
                filterPrice(goodsList);
            }
            if ("end".equals(input)) break;
            if (!("f".equals(input)) && !(parts[0].equals("i"))) {
                goodsList.get(goodsNum).setQuantityGoods(Integer.parseInt(parts[1]));
            }
        }

        showBasket(goodsList);
        // Dependency Inversion Principle - здесь выполняется принцип
        // инверсии зависимостей т.к. вышестоящий класс не зависит
        // от ниже стоящих классов
        ivan.buyerSendMail.send("ivan@mail.ru");
    }

    private static void filterPrice(List<Goods> goods) {
        Collections.sort(goods, new Comparator<Goods>() {
            public int compare(Goods o1, Goods o2) {
                return Integer.valueOf(o1.getPrice()).compareTo(o2.getPrice());
            }
        });
    }

    private static void showGoods(List<Goods> goods) {
        System.out.println("Товары для покупки: ");
        for (Goods good : goods) {
            System.out.println(good);
        }
    }

    private static void showBasket(List<Goods> goods) {
        int costGoods = 0;
        System.out.println("Корзина: ");
        for (Goods good : goods) {
            if (good.getQuantity() != 0) {
                costGoods += good.getQuantity() * good.getPrice();
                System.out.println(good + " кол-во = " + good.getQuantity() + " шт."
                        + " цена = " + good.getPrice() + " руб."
                        + " цена за всё = " + good.getQuantity() * good.getPrice() + " руб.");
            }
        }

        System.out.println("Итого: " + costGoods + " руб.");
    }

}
