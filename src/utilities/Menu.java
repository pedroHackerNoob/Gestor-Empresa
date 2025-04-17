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
    public static void menuClient(){
        System.out.println("Menu\nIngrese cliente:");
        String name = "pollo";
        RepositoryClientsImpl.addClient(new Client(name));
        RepositoryClientsImpl.getClients();
        setProducts();
        setServices();
        getResumen();
    }
    public static void setProducts(){
        RepositoryProductsImpl.addProduct(new Product(
                Description.getName(),
                Description.getPrice(),
                Description.getStock()));

        System.out.println("producto:");
        String nombre= "carbon";
        double price = 20;
        int stock = 3;
//        product
        RepositoryProductsImpl.addProduct(new Product(nombre, price, stock));
        RepositoryProductsImpl.addProduct(new Product("pechuga", 20, 2));
        RepositoryProductsImpl.addProduct(new Product("zanahoria", 15, 2));
    }
    public static void setServices(){
        RepositoryServicesImpl.addService(new Service(Description.getName(),
                Description.getPrice(),
                Description.getStock()));
        System.out.println("Servicio:");
        String nombre= "vix";
        double price = 130;
        int stock = 2;
//        services
        RepositoryServicesImpl.addService(new Service(nombre,price, stock));
        RepositoryServicesImpl.addService(new Service("netflix",130, 1));
        RepositoryServicesImpl.addService(new Service("spotify",100, 3));
    }

    public static void getResumen(){
//        RepositoryClientsImpl.getClient(0);
        RepositoryProductsImpl.getProducts();
        RepositoryServicesImpl.getServices();
        AritmeticImpl.Total();
    }
}
