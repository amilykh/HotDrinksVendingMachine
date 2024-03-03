package beverages;


/**
 * Класс эспрессо
 */
public class Espresso extends HotBeverage implements ProductCodes, Volume {
    /**
     * Конструктор - создание нового объекта с определёнными значениями
     * @param productCode код продукта
     * @param price цена
     * @param volume объём
     * @param temperature температура
     */
    private Espresso(int productCode, double price, int volume,
                    int temperature) {
        super(productCode, price, volume, temperature);
    }

    /**
     * Конструктор - создание нового объекта с определёнными значениями
     * @param price цена
     * @param volume объём
     * @param temperature темпратура
     */
    public Espresso( double price, int volume,
                    int temperature) {
        this(ProductCodes.ESPRESSO, price, volume, temperature);
    }


    /**
     * Метод получения информации об объекте эспрессо в виде строки
     * @return строка
     */
    @Override
    public String toString() {
        return "Код: " + getProductCode() + " (Эспрессо - " + getVolume() +
                " мл., " + getTemperature() + " градусов, " + getPrice() +
                " руб.)";
    }
}
