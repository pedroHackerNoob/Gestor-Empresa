package controllers;

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
        System.out.println("Desea repetir la operacion?");
        String responseText = sc.nextLine();
        return !responseText.isEmpty();
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
            name = sc.nextLine();
            System.out.println("Ingrese precio:");
            price = sc.nextDouble();
            System.out.println("Ingrese cantidad:");
            stock = sc.nextInt();
        } catch (Exception e) {
            assignDescriptionProduct();
        }
    }
    public static void assignRemoveProduct(){
        try {
            System.out.println("Ingrese id del producto: ");
            idSelect = sc.nextInt();
        } catch (Exception e) {
            sc.nextLine();
            assignRemoveProduct();
        }
    }
    public static void selectSale(int option){
//        int option;
//        System.out.println("Ingrese opcion:");
//        option = sc.nextInt();

        switch (option){
            case 1:
//                assignDescriptionProduct();
//                Menu.addProduct(name, price, stock);
                Menu.addProduct("pollo", 10, 1);

//                Menu.addProduct("ree", 10, 1);
//                selectSale(2);
                break;
            case 2:
//                assignDescriptionClient();
//                Menu.deleteProduct(idDelete);
                Menu.deleteProduct(1);
                break;
            default:
                break;
        }
//        RepositoryProductsImpl.getProducts();
        AritmeticImpl.changeMoney(200);
        sc.close();
    }

}
