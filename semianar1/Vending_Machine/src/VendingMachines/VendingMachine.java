package VendingMachines;

import java.util.ArrayList;
import java.util.List;

import Domen.Product;

public class VendingMachine {
    private int volumeVM;
    private List<Product> productsListVM;

    public VendingMachine(int volume) {
        this.volumeVM = volume;
        productsListVM = new ArrayList<Product>();
    }

    public int getVolumeVM() {
        return volumeVM;
    }

    public void setVolumeVM(int volumeVM) {
        this.volumeVM = volumeVM;
    }

    public List<Product> getProductsListVM() {
        return productsListVM;
    }

    public void setProductsListVM(List<Product> productsListVM) {
        this.productsListVM = productsListVM;
    }

    public void addProduct(Product product) {
        productsListVM.add(product);
    }
}
