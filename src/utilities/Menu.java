package utilities;

import controllers.AritmeticImpl;
import controllers.Description;
import models.Client;
import models.Product;
import models.Service;
import repositories.RepositoryClientsImpl;
import repositories.RepositoryProductsImpl;
import repositories.RepositoryServicesImpl;


public class Menu {
    public static void menuClient(String name){
        RepositoryClientsImpl.addClient(new Client(name));
    }
    public static void setProducts(String name, double price, int stock){
        RepositoryProductsImpl.addProduct(new Product(name, price, stock));

        AritmeticImpl.subtotal(price,stock);
    }

    public static void getResumen(){
        RepositoryClientsImpl.getClients();
        RepositoryProductsImpl.getProducts();
        AritmeticImpl.totalResumen();
        AritmeticImpl.changeMoney(200);
    }
}
