package repositories;

import controllers.AritmeticImpl;
import models.Product;

import java.util.ArrayList;

public class RepositoryProductImpl {
    private static final ArrayList<Product> products = new ArrayList<>();

    public static void getProducts() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++  Lista de Productos  ++++++++++++");
        int idtemp =0;
        for (Product product : products) {
            System.out.println(AritmeticImpl.Subtotal(idtemp,product.getName(),product.getPrice(), product.getStock()));
            idtemp++;
        }
    }

    public static void getProduct(int id) {
        System.out.println(products.get(id).getName()
                +" "+products.get(id).getPrice()
                +" "+products.get(id).getStock());
    }

    public static void addProduct(Product product) {
        products.add(product);
    }

    public static void updateProduct(int id, Product product) {
        System.out.println("\nEditando Producto");
        products.set(id, product);
    }

    public static void deleteProduct(int product) {
        products.remove(product);
    }
}
