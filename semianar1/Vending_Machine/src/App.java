import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import VendingMachines.VendingMachine;
public class App {
    public static void main(String[] args) throws Exception {

        VendingMachine iMachine = new VendingMachine(300);
        iMachine.addProduct(new Product(1, "Lays", 59, "Чипсы"));
        iMachine.addProduct(new Bottle(2, "Cola", 70, "Water", 0.5));
        iMachine.addProduct(new Product(3, "Butter", 159, "Oil"));
        iMachine.addProduct(new Bottle(4, "Water", 20, "Water", 1));
        iMachine.addProduct(new HotDrink(5, "Tea", 50, "Hot drinks", 95));
        iMachine.addProduct(new HotDrink(6, "Coffe", 100, "Hot drinks", 95));
        iMachine.addProduct(new HotDrink(7, "Coffe with milk", 110, "Hot drinks", 90));
        
        for(Product prod: iMachine.getProductsListVM())
       {
           System.out.println(prod.toString());
       }

    }
}
