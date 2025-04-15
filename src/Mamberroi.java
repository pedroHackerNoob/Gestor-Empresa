/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import models.Product;
import repositories.RepositoryProductImpl;

/**
 *
 * @author blackhawk
 */
public class Mamberroi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RepositoryProductImpl repository = new RepositoryProductImpl();

        repository.addProduct(new Product("papa",17.00,90));
        repository.addProduct(new Product("tomate",30.00,40));
        repository.addProduct(new Product("zanahoria",12.00,14));
        repository.getProducts();
        repository.updateProduct(1, new Product("cilantro",17.00,5));
        repository.getProducts();
    }

}
