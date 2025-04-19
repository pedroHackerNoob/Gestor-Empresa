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
        name = "pablo";
        System.out.println("Ingrese nombre de cliente: "+name);
//        name = sc.nextLine();
        Menu.menuClient(name);
    }
    public static void assignDescriptionProduct(){
        try {
            System.out.println("Ingrese nombre de producto: ");
            name = sc.nextLine();
//            System.out.println("Ingrese precio:");
            price = 10;
//            price = sc.nextDouble();
//            System.out.println("Ingrese cantidad:");
            stock = 1;
//            stock = sc.nextInt();
//            System.out.println("Ingrese opcion:");
            int option = 1;
//            option = sc.nextInt();

//            name = sc.nextLine();
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
    public static void selectSale(int option){
        switch (option){
            case 1:
//                producto
                break;
            case 2:
                break;
            case 3:
            case 4:
            case 5:

            default:
                break;
        }
    }

}
