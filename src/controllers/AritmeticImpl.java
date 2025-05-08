package controllers;

import models.Product;
import repositories.RepositoryProductsImpl;

public class AritmeticImpl {
    private static int idTemp =0;
    private static double total=0;
    private static double subtotal = 0;

    public static void setDiscountTotal(double discount) {
        total-=discount;
        System.out.println("se desconto: $"+discount);
    }
    public static String setDescriptionItem(Product product){
        System.out.println("+-------+-------+-------------------+---------------+----------------+");
        return product.getName()
                +"\t| precio C/U $"+product.getPrice()
                +"\t| Cantidad: "+product.getStock()
                +"\t| subtotal: $"+product.getSubTotal();

    }

    public static double setSubtotal(double price, int stock) {
        if (stock<1 || price<1) {
            System.out.println("Error: no valido");
        }else {
            subtotal = price * stock;
            setIdTemp();

        }

        return subtotal;
    }

    public static double getSubtotal() {

        return subtotal;
    }

    public static double changeMoney(double change){

        if(change>= total){
            System.out.println("+--------------------------------------------------------------------+");
            System.out.println("|                       Resumen de carrito                           |");
            RepositoryProductsImpl.getAllProducts();
            getTotal();
            System.out.println("+--------------------------------------------------------------------+");
            System.out.println("|                         Metodo de pago                             |");
            System.out.println("+--------------------------------------------------------------------+");
            System.out.println("Pago: $"+change);
            change-=total;
            System.out.println("cambio: $"+change);
        }else {
            System.out.println("no tiene dinero suficiente");
        }
        System.out.println("+--------------------------------------------------------------------+");
        return change;
    }
    public static int getIdTemp() {
        return idTemp;
    }

    public static void setIdTemp() {
        ++idTemp;
    }

    public static void setTotal(double subtotal) {
        total += subtotal;
    }
    public static double getTotal() {
        System.out.println("Total a pagar: $"+total);
        return total;
    }
}
