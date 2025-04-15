/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import models.Supplier;
import repositories.RepositorySuppliersImpl;

/**
 *
 * @author blackhawk
 */
public class Mamberroi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RepositorySuppliersImpl suppliers = new RepositorySuppliersImpl();
        suppliers.addSupplier(new Supplier("pepe","coca","xyz132","c11 av 10",646130120));
        suppliers.addSupplier(new Supplier("xzibit","coca","xyz132","c11 av 10",646130120));
        suppliers.addSupplier(new Supplier("fofo","coca","xyz132","c11 av 10",646130120));
        suppliers.deleteSupplier(2);
        suppliers.updateSupplier(1,new Supplier("xdfr","coca","xyz132","c11 av 10",646130120));
        suppliers.getSuppliers();
        suppliers.getSupplier(0);
    }

}
