package controllers;

import utilities.Menu;

import java.util.Scanner;

public class Description {
    static Scanner sc = new Scanner(System.in);
    private static String name;
    private static double price;
    private static int stock;
    private static int option;


    public static void assignDescriptionClient() {
        System.out.println("Ingrese nombre:");
//        name = sc.nextLine();
        name = "pablo";
        Menu.menuClient(name);
    }
    public static void assignDescriptionProduct(){
        try {
            System.out.println("Ingrese nombre:");
            name = sc.nextLine();
//            System.out.println("Ingrese precio:");
//            System.out.println("Ingrese cantidad:");
//            price = sc.nextDouble();
//            stock = sc.nextInt();
//            System.out.println("Ingrese opcion:");
//            option = sc.nextInt();

//            name = "cacao";
            price = 10;
            stock = 1;

            if (stock <0){

            }
            option = 1;
            selectSale(option);
//            name = sc.nextLine();
        } catch (Exception e) {
            sc.nextLine();
            assignDescriptionProduct();
        }
    }
    public static void selectSale(int option){
        switch (option){
            case 1:
//                producto
                Menu.setProducts(name, price, stock);
                break;
            case 2:
//                service
                break;
            case 3:
            case 4:
            case 5:

            default:
                break;
        }
    }

    public static String getName() {
        return name;
    }

    public static double getPrice() {
        return price;
    }

    public static int getStock() {
        return stock;
    }
}
