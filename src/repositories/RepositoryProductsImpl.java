package repositories;

import controllers.AritmeticImpl;
import models.Product;

import java.util.ArrayList;

public class RepositoryProductsImpl {
    private static final ArrayList<Product> products = new ArrayList<>();

    public static void getProducts() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++  Lista de Productos  ++++++++++++");
        int idtemp =0;

        for (Product product : products) {
            System.out.println("ID: "+idtemp+" "+AritmeticImpl.setDescriptionItem(product));
            idtemp++;
        }
    }

    public static void getProduct(int id) {
        System.out.println(products.get(id).getName()
                +" "+products.get(id).getPrice()
                +" "+products.get(id).getStock()
                +" "+products.get(id).getSubTotal());
    }

    public static void addProduct(Product product) {
        products.add(product);
    }

    public static void updateProduct(int id, Product product) {
        System.out.println("\nEditando Producto");
        products.set(id, product);
    }

    public static void deleteProduct(int id) {
        System.out.println("##########################################");
        int tamanio = products.size();
        int idtemp = tamanio -id;
        if (id >= tamanio) {
            System.out.println(tamanio+" imposible eliminar el producto: "+id);

        } else {
            AritmeticImpl.discountTotal(products.get(id).getSubTotal());
            if(tamanio==1 || idtemp ==1) {
                System.out.println("producto cancelado");
//            se tiene que cambiar el subtotal
                RepositoryProductsImpl.updateProduct(id, new Product(products.get(id).getName(), 0,0));

            }
            System.out.println("Nombre: "+products.get(id).getName()+" eliminado "+id);
            products.remove(id);
        }



    }
}
