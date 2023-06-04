package Domen;

public class Product {
    private String nameProduct;
    private double priceProduct;
    private String categoryProduct;
    private int idProduct;

    public int getIdProduct() {
        return idProduct;
    }

    public String getCategoryProduct() {
        return categoryProduct;
    }

    public void setCategoryProduct(String categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        if (priceProduct <= 0)
        {
            throw new IllegalStateException(String.format("Цена указана некорректно", priceProduct));
        } else {
            this.priceProduct = priceProduct;
        }
    }

    /**
     * Создание экземпляра класса Product
     * @param name наименование продукта
     * @param price стоимость товара
     * @param category категория продукта
     * @param id id номер продукта
     */

    public Product (int id, String name, double price, String category) {
        this.nameProduct = name;   // пока с this что бы привыкнуть 
        this.categoryProduct = category;
        this.idProduct = id;
        this.priceProduct = price;
    }
    
    @Override
    public String toString() {
        return "Product { " +
        "name = '" + nameProduct + '\'' + 
        ", category = '" + categoryProduct + '\'' +
        ", cost = " + priceProduct + 'р' +
        " }";
    }
}
 