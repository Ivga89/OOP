package Domen;

public class HotDrink extends Product{
    private int temperatureProduct;

    public int getTemperatureProduct() {
        return temperatureProduct;
    }

    public void setTemperatureProduct(int temperatureProduct) {
        this.temperatureProduct = temperatureProduct;
    }

    /**
     * Создание экземпляра класса HotDrink
     * @param id id
     * @param name название
     * @param price цена в рублях
     * @param category категория
     * @param temperatureProduct температура в цельсиях
     */

    public HotDrink(int id, String name, double price, String category, int temperatureProduct) {
        super(id, name, price, category);
        this.temperatureProduct = temperatureProduct;
    }

    @Override
    public String toString() {
        return "Product { " +
        "name = '" + super.getNameProduct() + '\'' + 
        ", category = '" + super.getCategoryProduct() + '\'' +
        ", cost = " + super.getPriceProduct() +  'р' +
        ", temperature = " + temperatureProduct + "*C" +
        " }";
    }
}
