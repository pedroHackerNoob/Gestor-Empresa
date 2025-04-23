package controllers;

import models.Product;
import repositories.RepositoryProductsImpl;

public class AritmeticImpl {

    private static double total=0;

    public static void discountTotal(double discount) {
        total-=discount;
    }
    public static double getTotal() {
        return total;
    }
    public static String setDescriptionItem(Product product){
        System.out.println("+-------+-------+-------------------+---------------+----------------+");
        return product.getName()
                +"\t| precio C/U $"+product.getPrice()
                +"\t| Cantidad: "+product.getStock()
                +"\t| subtotal: $"+product.getSubTotal();

    }
    public static void setSubtotal(double price, int stock) {
        double subtotal = price * stock;
        total += subtotal;
        getTotalResumen();
    }
    public static void getTotalResumen(){
        System.out.println("Total a pagar: $"+getTotal());
    }
    public static void changeMoney(double change){
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|                       Resumen de carrito                           |");
        RepositoryProductsImpl.getProducts();
        getTotalResumen();
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("|                         Metodo de pago                             |");
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("Pago: $"+change);
        change-=total;

        if(change>0){
            System.out.println("cambio: $"+change);
        }else {
            System.out.println("no tiene dinero suficiente");
        }
        System.out.println("+--------------------------------------------------------------------+");
    }
}
