package utilities;

import models.Client;
import models.Product;
import repositories.RepositoryClientsImpl;
import repositories.RepositoryProductsImpl;


public class Menu {

    public static void menuClient(String name){
        RepositoryClientsImpl.addClient(new Client(name));
    }

    public static void addProduct(String name, double price, double subtotal, int stock){
        RepositoryProductsImpl.addProduct(new Product(name, price, stock,subtotal ,"en progreso"));
    }


}
