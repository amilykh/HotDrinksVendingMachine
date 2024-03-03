package machine;

import beverages.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс торгового автомата горячих напитков со свойствами
 * <b>hotBeverages</b>, <b>machineBalance</b> и <b>customerBalance</b>.
 */
public class HotDrinksVendingMachine implements VendingMachine {
    /** поле горячие напитки */
    final private List<HotBeverage> hotBeverages;
    /** поле баланс торгового автомата  горячих напитков */
    private double  machineBalance;
    /** поле баланс покупателя */
    private double  customerBalance;

    {
        //balance = BigDecimal.valueOf(0);
        machineBalance = 0;
        customerBalance = 0;
    }

    /**
     * Конструтор - создание нового объекта
     */
    public HotDrinksVendingMachine() {
        this.hotBeverages = new ArrayList<>();
    }

    /**
     * Метод {@link VendingMachine#addProduct(Product)}
     * @param product объект продукта
     */
    @Override
    public void addProduct(Product product) {
        if (product instanceof  HotBeverage) {
            hotBeverages.add((HotBeverage) product);
        }
    }

    /**
     * Метод {@link VendingMachine#getProduct(int, int, int)}
     */
    @Override
    public Product getProduct(int name, int volume, int temperature) {
        for (HotBeverage beverage : hotBeverages) {
            if (beverage.getProductCode() == name &&
                    beverage.getVolume() == volume &&
                    beverage.getTemperature() == temperature) {
                return beverage;
            }
        }
        return null;
    }

    /**
     * Метод получения значения поля
     * {@link HotDrinksVendingMachine#customerBalance}
     * @return возвращает баланс покупателя
     */
    public double getCustomerBalance() {
        return customerBalance;
    }

    /**
     * Метод присвоения значения полю
     * {@link HotDrinksVendingMachine#customerBalance}
     * @param money значение для присвоения
     */
    public void setCustomerBalance(double money) {
        this.customerBalance = money;
    }

    /**
     * Метод получения значения поля
     * {@link HotDrinksVendingMachine#machineBalance}
     * @return возвращает баланс торгового автомата горячих напитков
     */
    public double getMachineBalance() {
        return machineBalance;
    }

    /**
     * Метод присвоения  значения полю
     * {@link HotDrinksVendingMachine#machineBalance}
     * @param money значение для присвоения
     */
    public void setMachineBalance(double money) {
        this.machineBalance += money;
    }

    /**
     * Метод {@link VendingMachine#depositMoney(double)}
     * @param money деньги для внесения
     */
    @Override
    public void depositMoney(double money) {
        setCustomerBalance(getCustomerBalance() + money);
    }

    /**
     * Метод получения значения поля
     * {@link HotDrinksVendingMachine#hotBeverages}
     * @return возвращает список дотупных горячих напитков
     */
    public List<HotBeverage> getHotBeverages() {
        return hotBeverages;
    }

    /**
     * Метод продажи продукта на внесённую сумму
     * @param product продукт для продажи
     * @param money сумма, внесённая для продажи
     */
    public void sellProduct(Product product, double money) {
        if (money <= 0) {
            System.out.println(
                    "Ошибка! Вносимые средтсва должны быть больше 0 !");
            return;
        }

        System.out.println("Внесение " + money + " руб. в автомат");
        depositMoney(money);
        showCustomerBalance();
        if (getCustomerBalance() < product.getPrice()) {
            System.out.println("Недостаточно средств для покупки напитка\n" +
                    "'" + product +"' !");
            double returnMoney = getCustomerBalance();
            setCustomerBalance(0);
            returnMoney(returnMoney);
        } else {
            System.out.println("Напиток '" + product +
                    "'\nприготавливается...");
            double change = getCustomerBalance() - product.getPrice();
            System.out.println("Возьмите свой напиток!");
            setMachineBalance(product.getPrice());
            setCustomerBalance(0);
            if (change > 0) {
                returnChange(change);
            }
        }
    }

    /**
     * Метод возврата денег
     * @param money возвращаемые деньги
     */
    @Override
    public void returnMoney(double money) {
        System.out.println("Возрат: " + money +
                " руб. Возьмите деньги!");
        showCustomerBalance();
    }

    /**
     * Метод выдачи сдачи
     * @param change сдача
     */
    private void returnChange(double change) {
        System.out.println("Сдача: " + change +
            " руб. Возьмите деньги!");
        showCustomerBalance();
    }

    /**
     * Метод отображение баланса покупателя
     */
    public void showCustomerBalance()
    {
        System.out.println("Баланс покупателя: " + getCustomerBalance() +
                " руб.");
    }
}
