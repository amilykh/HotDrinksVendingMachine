package machine;

import beverages.Product;

/**
 * Интерфейс торгового автомата
 */
public interface VendingMachine {

    /**
     * Метод добавляет продукт в торговый автомат
     * @param product объект продукта
     */
     void addProduct(Product product);

    /**
     * Метод получения продукта
     * @param name код продукта
     * @param volume объём
     * @param temperature температура
     * @return продукт соотвествующего напитка в торговом автомате
     */
     Product getProduct(int name, int volume, int temperature);

    /**
     * Метод внесения денег
     * @param money деньги для внесения
     */
     void depositMoney(double money);

    /**
     * Метод получения денег
     * @param money деньги для возврата
     */
     void returnMoney(double money);
}
