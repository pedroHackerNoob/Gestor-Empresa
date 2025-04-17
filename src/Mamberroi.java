/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import models.Client;
import repositories.RepositoryClientsImpl;

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
        RepositoryClientsImpl.addClient(new Client("Mamberroi"));
        RepositoryClientsImpl.getClients();
    }
}
