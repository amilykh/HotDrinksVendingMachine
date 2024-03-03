package beverages;


/**
 * Класс американо
 */
public class Americano extends HotBeverage implements ProductCodes, Volume {
    /**
     * Конструктор - создание нового объекта с определёнными значениями
     * @param productCode код продукта
     * @param price цена
     * @param volume объём
     * @param temperature температура
     */
    private Americano(int productCode, double price, int volume,
                      int temperature) {
        super(productCode, price, volume, temperature);
    }

    /**
     * Конструктор - создание нового объекта с определёнными значениями
     * @param price цена
     * @param volume объём
     * @param temperature температура
     */
    public Americano(double price, int volume,
                     int temperature) {
        this(ProductCodes.AMERICANO, price, volume, temperature);
    }

    /**
     * Метод получения информации об объекте американо в виде строки
     * @return строка
     */
    @Override
    public String toString() {
        return "Код: " + getProductCode() + " (Американо - " + getVolume() +
                " мл., " + getTemperature() + " градусов, " + getPrice() +
                " руб.)";
    }
}
