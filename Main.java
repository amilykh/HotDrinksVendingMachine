import beverages.*;
import machine.*;


public class Main {
    public static void main(String[] args) {
        // Создаём  торговый автомат горячих напитков
        HotDrinksVendingMachine vendingMachine= new HotDrinksVendingMachine();

        // Наполняем его продуктами, доступными для продажи
        initMachine(vendingMachine);

        // Формирум запрос торговому автомату горячих напитков на приготовление
        // продукта с определёнными параметрами
        Product desiredProduct = vendingMachine.getProduct(
                ProductCodes.AMERICANO, Volume.MEDIUM, 75);

        // Проверяем возможность приготовления продукта
        if (desiredProduct != null) { // Если она есть,
            // пытаемся купить его за внесённую сумму денег money
            vendingMachine.sellProduct(desiredProduct, 50);
        } else {
            System.out.println("Продукт не найден !");
        }
        System.out.println();

        if (desiredProduct != null) {
            vendingMachine.sellProduct(desiredProduct, 100);
        } else {
            System.out.println("Продукт не найден !");
        }
        System.out.println();


        desiredProduct = vendingMachine.getProduct(
                ProductCodes.TEA, Volume.BIG, 70);

        if (desiredProduct != null) {
            vendingMachine.sellProduct(desiredProduct, 80);
        } else {
            System.out.println("Продукт не найден !");
        }
        System.out.println();


        desiredProduct = vendingMachine.getProduct(
                10, Volume.BIG, 70);

        if (desiredProduct != null) {
            vendingMachine.sellProduct(desiredProduct, 80);
        } else {
            System.out.println("Продукт не найден !");
        }
        System.out.println();

        // Выводим информацию о выручке торгового автомата горячих напитков
        System.out.println("Выручка автомата: " +
                vendingMachine.getMachineBalance() +
                " руб.");
    }


    /**
     * Заполнение торгового автомата горячих напитков продуктами, доступными
     * для продажи.
     * @param vendingMachine торговый автомат горячих напитков
     */
    static void initMachine(HotDrinksVendingMachine vendingMachine) {
        // Создаём горячие напитки

        HotBeverage espresso = new Espresso(60.0, Volume.SMALL,
                75);
        HotBeverage americano = new Americano(90.0, Volume.MEDIUM,
                75);
        HotBeverage latte = new Latte(120.0, Volume.BIG, 60);
        HotBeverage tea = new Tea(60.0, Volume.BIG, 70);
        HotBeverage hot_chocolate = new HotChocolate(100.0,
                Volume.MEDIUM, 65);

        // Добавляем их в автомат
        vendingMachine.addProduct(espresso);
        vendingMachine.addProduct(americano);
        vendingMachine.addProduct(latte);
        vendingMachine.addProduct(tea);
        vendingMachine.addProduct(hot_chocolate);

        // Отображаем список доступных напитков
        showProducts(vendingMachine);
    }


    /**
     * Метод отображения продуктов торгового автомата горячих напитков,
     * доступных для продажи
     * @param vendingMachine торговый автомат горячих напитков
     */
    static  void showProducts(HotDrinksVendingMachine vendingMachine) {
        // Выводим информацию о горячих напитках
        vendingMachine.showCustomerBalance();
        System.out.println("Список доступных  горячих напитков.");
        System.out.println("===================================");
        for (Product productItem : vendingMachine.getHotBeverages()) {
            System.out.println(productItem);
        }
        System.out.println();
    }
}
