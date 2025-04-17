/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import controllers.AritmeticImpl;
import controllers.Description;
import repositories.RepositoryProductsImpl;

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
//        Menu.menuClient();
        for (int i = 0; i <= 3; i++) {
            System.out.println(i);
            Description.assignDescription();
            RepositoryProductsImpl.getProducts();
            AritmeticImpl.totalResumen();
            AritmeticImpl.changeMoney(200);
        }


    }
}
