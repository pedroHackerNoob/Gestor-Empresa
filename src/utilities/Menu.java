package utilities;

import controllers.AritmeticImpl;
import models.Client;
import models.Product;
import models.Service;
import repositories.RepositoryClientsImpl;
import repositories.RepositoryProductImpl;
import repositories.RepositoryServicesImpl;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    public static void menuClient(){
        System.out.println("Menu\nIngrese cliente:");
//        String name = sc.nextLine();
        String name = "pollo";
        RepositoryClientsImpl.addClient(new Client(name));
        RepositoryClientsImpl.getClients();
        menuProduct();
    }
    public static void menuProduct(){
        System.out.println("Ingrese producto:");
        System.out.println("Ingrese nombre:");
//        String nombre= sc.nextLine();
        String nombre= "carbon";
        System.out.println("Ingrese precio:");
//        int price = Integer.parseInt(sc.nextLine());
        double price = 22;
        System.out.println("Ingrese stock:");
//        int stock = Integer.parseInt(sc.nextLine());
        int stock = 3;

//        product
        RepositoryProductImpl.addProduct(new Product(nombre, price, stock));
        RepositoryProductImpl.addProduct(new Product("pechuga", 20, 2));
        RepositoryProductImpl.addProduct(new Product("zanahoria", 15, 3));
        RepositoryClientsImpl.getClient(0);
        RepositoryProductImpl.getProducts();
//        services
        RepositoryServicesImpl.addService(new Service("hbo",130, 1));
        RepositoryServicesImpl.addService(new Service("netflix",130, 1));
        RepositoryServicesImpl.addService(new Service("spotify",100, 3));
        RepositoryServicesImpl.getServices();
        AritmeticImpl.Total();
    }
}
