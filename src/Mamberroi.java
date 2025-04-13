/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import models.Client;
import repositories.RepositoryCustomersImpl;

/**
 *
 * @author blackhawk
 */
public class Mamberroi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RepositoryCustomersImpl repo = new RepositoryCustomersImpl();
        repo.addClient(new Client("Mamberroi"));
        repo.addClient(new Client("carpincho"));
        repo.addClient(new Client("carpincho"));
//        repo.deleteClient();
        repo.getClients();
    }
    
}
