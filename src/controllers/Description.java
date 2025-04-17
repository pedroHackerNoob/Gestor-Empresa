package controllers;

import repositories.RepositoryProductsImpl;
import repositories.RepositoryServicesImpl;
import utilities.Menu;

import java.util.Scanner;

public class Description {
    static Scanner sc = new Scanner(System.in);
    private static String name;
    private static double price;
    private static int stock;
    private static int option;
    public static String getName() {
        return name;
    }

    public static double getPrice() {
        return price;
    }

    public static int getStock() {
        return stock;
    }

    public static void assignDescription(){
        try {
            System.out.println("Ingrese nombre:");
//            name = sc.nextLine();
            System.out.println("Ingrese precio:");
//            price = sc.nextDouble();
            System.out.println("Ingrese cantidad:");
//            stock = sc.nextInt();
//            System.out.println("Ingrese opcion:");
//            option = sc.nextInt();

            name = "cacao";
            price = 12;
            stock = 3;
            option = 1;
            selectSale(option);
            name = sc.nextLine();
        } catch (Exception e) {
            sc.nextLine();
//            assignDescription();
        }
    }
    public static void selectSale(int option){
        switch (option){
            case 1:
//                product
                Menu.setProducts();
                break;
            case 2:
//                service
                Menu.setServices();
                break;
            case 3:
            case 4:
            case 5:

            default:
        }
        Menu.getResumen();

    }
}
