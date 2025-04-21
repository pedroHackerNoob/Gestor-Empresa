package utilities;

import controllers.AritmeticImpl;
import models.Client;
import models.Product;
import repositories.RepositoryClientsImpl;
import repositories.RepositoryProductsImpl;


public class Menu {

    public static void menuClient(String name){
        RepositoryClientsImpl.addClient(new Client(name));
    }
    public static void addProduct(String name, double price, int stock){
        RepositoryProductsImpl.addProduct(new Product(name, price, stock));
        AritmeticImpl.setSubtotal(price, stock);
    }
    public static void deleteProduct(int id){
        RepositoryProductsImpl.deleteProduct(id);
    }

}
