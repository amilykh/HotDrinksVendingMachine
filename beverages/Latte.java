package beverages;


/**
 * Класс Латте
 */
public class Latte extends HotBeverage implements ProductCodes, Volume {
    /**
     * Конструктор - создание нового объекта с определёнными значениями
     * @param productCode код продукта
     * @param price цена
     * @param volume объём
     * @param temperature температура
     */
    private Latte(int productCode, double price, int volume,
                  int temperature) {
        super(productCode, price, volume, temperature);
    }

    /**
     * Конструктор - создание нового объекта с определёнными значениями
     * @param price цена
     * @param volume объём
     * @param temperature температура
     */
    public Latte(double price, int volume,
                 int temperature) {
        this(ProductCodes.LATTE, price, volume, temperature);
    }


    /**
     * Метод получения информации об объекте латте в виде строки
     * @return строка
     */
    @Override
    public String toString() {
        return "Код: " + getProductCode() + " (Латте - " + getVolume() +
                " мл, " + getTemperature() + " градусов, " + getPrice() +
                " руб.)";
    }
}
