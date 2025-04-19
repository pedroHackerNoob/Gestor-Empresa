package controllers;

import repositories.RepositoryProductsImpl;
import utilities.Menu;

import java.util.Scanner;

public class Description {
    static Scanner sc = new Scanner(System.in);
    private static String name;
    private static double price;
    private static int stock;

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
//            name = sc.nextLine();
//            System.out.println("Ingrese precio:");
//            price = sc.nextDouble();
//            System.out.println("Ingrese cantidad:");
//            stock = sc.nextInt();

            name= "paco";
            price = 10;
            stock = 1;
        } catch (Exception e) {
            assignDescriptionProduct();
        }
    }
    public static void assignRemoveProduct(){
        try {
            int idTemp = sc.nextInt();
            RepositoryProductsImpl.deleteProduct(idTemp);
        } catch (Exception e) {
//            sc.nextLine();
//            assignRemoveProduct();
        }
    }
    public static void selectSale(){
        System.out.println("Ingrese opcion:");
        int option =1;
//        option = sc.nextInt();

        switch (option){
            case 1:
                assignDescriptionProduct();
                Menu.addProduct(name, price, stock);
                Menu.addProduct("pollo", 10, 1);
                Menu.addProduct("carne", 10, 1);
                break;
            case 2:

                break;
            default:
                break;
        }
        RepositoryProductsImpl.getProducts();
        AritmeticImpl.changeMoney(200);
    }

}
