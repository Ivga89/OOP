package Domen;

public class Bottle extends Product {
    private double volumeProduct;

    /**
     * Создание экземпляра класса Bottle
     * @param name имя
     * @param id id номер
     * @param category категория
     * @param price цена в рублях
     * @param volume объем в литрах
     * @throws Exception
     */

    public Bottle(int id, String name, double price, String category, double volume) {
        super(id, name, price, category); // конструктор родителя
        this.volumeProduct = volume;
    }

    public double getVolume() {
        return volumeProduct;
    }

    public void setVolume(double volume) {
        this.volumeProduct = volume;
    }

    @Override
    public String toString() {
        return "Product { " +
        "name = '" + super.getNameProduct() + '\'' + 
        ", category = '" + super.getCategoryProduct() + '\'' +
        ", cost = " + super.getPriceProduct() +  'р' +
        ", volume = " + volumeProduct + 'л' +
        " }";
    }
}
