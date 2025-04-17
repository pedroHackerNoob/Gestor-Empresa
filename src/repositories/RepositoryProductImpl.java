package repositories;

import models.Product;

import java.util.ArrayList;

public class RepositoryProductImpl {
    private static final ArrayList<Product> products = new ArrayList<>();

    public static void getProducts() {
        System.out.println("Lista de productos");
        int idtemp =0;
        for (Product product : products) {
            System.out.println(idtemp+" "+product.getName()+" Precio: "+product.getPrice()+" Stock:"+product.getStock());
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
