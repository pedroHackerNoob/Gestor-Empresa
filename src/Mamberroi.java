/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import controllers.AritmeticImpl;
import controllers.Description;
import repositories.RepositoryProductsImpl;
import utilities.Menu;

/**
 *
 * @author blackhawk
 */
public class Mamberroi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//
        Description.assignDescriptionClient();

        for (int i = 0; i <= 2; i++) {
            System.out.println("Iteracion "+i);
            Description.assignDescriptionProduct();
            RepositoryProductsImpl.getProducts();
            AritmeticImpl.totalResumen();
        }
        Menu.getResumen();

    }
}
