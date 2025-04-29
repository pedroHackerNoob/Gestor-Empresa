package repositories;

import SwingUI.Products;
import controllers.AritmeticImpl;
import models.Product;

import java.util.ArrayList;

public class RepositoryProductsImpl {
    static final ArrayList<Product> products = new ArrayList<>();

    public static void getProducts() {
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|                       Lista de Productos                           |");

        int idtemp =0;

        for (Product product : products) {
            System.out.println("| ID: "+idtemp+" | "+AritmeticImpl.setDescriptionItem(product)+"|");
            idtemp++;
        }
    }

    public static Product getProduct(int id) {
        if(products.get(id) != null){
            System.out.println(products.get(id).getName()
                    +" "+products.get(id).getPrice()
                    +" "+products.get(id).getStock()
                    +" "+products.get(id).getSubTotal());
        }
        return products.get(id);
    }

    public static void addProduct(Product product) {

        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|\t"+product.getName()+"\t precio: $"+product.getPrice()+"\t cantidad: "+product.getStock()+"\t subtotal: $"+product.getSubTotal());
        System.out.println("+--------------------------------------------------------------------+");
        products.add(product);
    }

    public static void updateProduct(int id, Product product) {
        products.set(id, product);
    }

    public static double deleteProduct(int id) {
        double subtotalTemp = products.get(id).getSubTotal();
        products.remove(id);
        return subtotalTemp;
    }

    public static int sizeProducts() {
        int size = products.size();
        return size;
    }
    public static void removeList(){
        products.clear();
    }
}
