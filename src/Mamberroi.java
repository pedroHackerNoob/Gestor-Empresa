/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import controllers.AritmeticImpl;
import repositories.RepositoryProductsImpl;
import utilities.Menu;
import utilities.RunMenu;

/**
 *
 * @author blackhawk
 */
public class Mamberroi {
    public static void testAdd(){
        System.out.println("Testing add");
        Menu.addProduct("0n",10,1);
        Menu.addProduct("1n",10,1);
        Menu.addProduct("2n",10,1);
        Menu.addProduct("3n",10,1);
//        Menu.addProduct("4n",10,1);
//        Menu.addProduct("5n",10,1);
//        RepositoryProductsImpl.getProducts();
        AritmeticImpl.getTotalResumen();
    }
    public static void testDelete(){
        System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("testing Delete");
//        Menu.deleteProduct();

//        Menu.deleteProduct(3);
        RepositoryProductsImpl.getProducts();
        AritmeticImpl.getTotalResumen();
//        AritmeticImpl.changeMoney(200);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testAdd();
        testDelete();
    }
}
