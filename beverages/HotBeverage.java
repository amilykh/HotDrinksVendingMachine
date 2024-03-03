package beverages;


/**
 * Класс горячий напиток со свойством <b>temperature</b>
 */
public class HotBeverage extends Beverage {
    /** Поле температура */
    private int temperature;

    /**
     * Конструктор - создание нового объекта с определёнными значениями
     * @param productCode код продукта
     * @param price цена
     * @param volume объём
     * @param temperature температура
     */
    public HotBeverage(int productCode, double price, int volume,
                       int temperature) {
        super(productCode, price, volume);
        this.temperature = temperature;
    }

    /**
     * Метод получения значения поля {@link HotBeverage#temperature}
      * @return возвращает температуру
     */
    public int getTemperature() {
        return this.temperature;
    }
}
