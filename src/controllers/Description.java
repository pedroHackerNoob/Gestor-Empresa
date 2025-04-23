package controllers;

import models.Product;
import repositories.RepositoryProductsImpl;
import utilities.Menu;

import java.util.Scanner;

public class Description {
    static Scanner sc = new Scanner(System.in);
    private static String name;
    private static double price;
    private static int stock;
    private static int idSelect;

    public static boolean responseLoop(){
        System.out.println("\n////////////////////////////");
        System.out.println("Desea repetir la operacion?\n[1] Repetir\n[0] No repetir");
        String responseText = sc.next();
        if(responseText.equals("1")){
            return true;
        }else {
            return false;
        }
    }

    public static void assignDescriptionClient() {
        String clientname = "pablo";
        System.out.println("Ingrese nombre de cliente: "+clientname);
//        name = sc.nextLine();
        Menu.menuClient(clientname);
    }

    public static void assignDescriptionProduct(){
        try {
            System.out.println("Ingrese nombre de producto: ");
            name = sc.next();
            System.out.println("Ingrese precio:");
            price = sc.nextDouble();
            System.out.println("Ingrese cantidad:");
            stock = sc.nextInt();
        } catch (Exception e) {
            sc.nextLine();
            assignDescriptionProduct();
        }
    }

    public static void assignRemoveProduct(){
        try {
            System.out.println("Ingrese id del producto: ");
            idSelect = sc.nextInt();
            Menu.deleteProduct(idSelect);
        } catch (Exception e) {
            sc.nextLine();
            assignRemoveProduct();
        }
    }

    public static void assignPayProduct(){
        double pay =0;
        System.out.println("Ingrese su dinero\n");
        System.out.print("$");
        pay = sc.nextDouble();
        if(pay>0){
            AritmeticImpl.changeMoney(pay);
        }else {
            System.out.println("saldo invalido: $"+pay);
        }
    }

    public static void selectSale(){
        boolean turn = true;
        int option;
        System.out.println("\nIngrese opcion:\n[1] Agregar item\n[2] Remover item\n[3] Listar items\n[4] Cobrar items");
//        option = 4;
        option = sc.nextInt();

        switch (option){
            case 1:
                while (turn){
                    System.out.println("+--------------------------------------------------------------------+");
                    System.out.println("|                       Producto Agregar                            |");
                    assignDescriptionProduct();
                    Menu.addProduct(name, price, stock);
                    AritmeticImpl.setSubtotal(price, stock);
                    turn = responseLoop();

                }

                break;
            case 2:
                while (turn){
                    assignRemoveProduct();
                    turn = responseLoop();
                }
                break;
            case 3:

                RepositoryProductsImpl.getProducts();
                break;
            case 4:
                assignPayProduct();
                break;
            default:
                break;
        }
        selectSale();
        sc.close();
    }

}
