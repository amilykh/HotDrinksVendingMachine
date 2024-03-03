package beverages;


/**
 * Класс напиток  со свойством <b>volume</b>
 */
public class Beverage extends Product {
    /** Поле объём */
    private int volume;

    /**
     * Конструктор создания нового объетка с определёнными значениями
     * @param productCode код продукта
     * @param price цена
     * @param volume объём
     */
    public Beverage(int productCode, double price, int volume) {
        super(productCode, price);
        this.volume = volume;
    }

    /**
     * Метод  получения знаения поля {@link Beverage#volume}
      * @return объём
     */
    public int getVolume() {
        return this.volume;
    }
}
