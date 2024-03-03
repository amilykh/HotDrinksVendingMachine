package beverages;


/**
 * Класс чай
 */
public class Tea extends HotBeverage implements ProductCodes, Volume {
    /**
     * Конструктор - создание нового объекта с определёнными значениями
     * @param productCode код продукта
     * @param price цена
     * @param volume объём
     * @param temperature температура
     */
    private Tea(int productCode, double price, int volume,
                int temperature) {
        super(productCode, price, volume, temperature);
    }

    /**
     * Конструктор - создание нового объекта с определёнными значениями
     * @param price цена
     * @param volume объём
     * @param temperature температура
     */
    public Tea(double price, int volume,
               int temperature) {
        this(ProductCodes.TEA, price, volume, temperature);
    }


    /**
     * Метод получения информации об объекте чай в виде строки
     * @return строка
     */
    @Override
    public String toString() {
        // return "Americano{}";
        return "Код: " + getProductCode() + " (Чай - " + getVolume() +
                " мл., " + getTemperature() + " градусов, " + getPrice() +
                " руб.)";
    }
}
