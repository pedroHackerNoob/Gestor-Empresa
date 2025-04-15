package repositories;

import models.Product;

import java.util.ArrayList;

public class RepositoryProductImpl implements RepositoryProduct {
    private final ArrayList<Product> products = new ArrayList<>();

    @Override
    public void getProducts() {
        System.out.println("Lista de productos");
        int idtemp =0;
        for (Product product : products) {
            System.out.println(idtemp+" "+product.getName()+" Precio: "+product.getPrice()+" Stock:"+product.getStock());
            idtemp++;
        }
    }

    @Override
    public void getProduct(int id) {
        System.out.println(products.get(id).getName()
                +" "+products.get(id).getPrice()
                +" "+products.get(id).getStock());
    }

    @Override
    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public void updateProduct(int id, Product product) {
        System.out.println("\nEditando Producto");
        this.products.set(id, product);
    }

    @Override
    public void deleteProduct(int product) {
        this.products.remove(product);
    }
}
