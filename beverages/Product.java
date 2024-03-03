package beverages;


/**
 * Класс продукт со свойствами <b>productCode</b> и <b>price</b>
 */
public class Product {
    /** Поле код продукта */
    private int productCode;

    /** Поле цена */
    private double price;

    /**
     * Конструтор - создание нового объекта с определёнными значениями
     * @param productCode код продукта
     * @param price цена
     */
    public Product(int productCode,  double price) {

        this.productCode = productCode;
        this.price = price;
    }

    /**
     * Метод получения значения поля кода продукта
     * {@link Product#productCode}
     * */
    public int getProductCode() {
        return this.productCode;
    }

    /**
     * Метод получения значения поля цена  {@link Product#price}
     * @return значение поля цена
     */
    public double getPrice() {
        return this.price;
    }
}
