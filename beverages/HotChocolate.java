package beverages;


/**
 * Класс горячий шоколад
 */
public class HotChocolate extends HotBeverage implements ProductCodes, Volume {
    /**
     * Конструктор - создание нового объекта с определёнными значениями
     * @param productCode код продукта
     * @param price цена
     * @param volume объём
     * @param temperature температура
     */
    private HotChocolate(int productCode, double price, int volume,
                         int temperature) {
        super(productCode, price, volume, temperature);
    }


    /**
     * Конструктор - создание нового объекта с определёнными значениями
     * @param price цена
     * @param volume объём
     * @param temperature температура
     */
    public HotChocolate(double price, int volume,
                        int temperature) {
        this(ProductCodes.HOT_CHOCOLATE, price, volume, temperature);
    }


    /**
     * Метод получения информации об объекте горячий шоколад в виде строки
     * @return строка
     */
    @Override
    public String toString() {
        return "Код: " + getProductCode() + " (Горячий шоколад - " +
                getVolume() + " мл., " + getTemperature() + " градусов, " +
                getPrice() + " руб.)";
    }
}
