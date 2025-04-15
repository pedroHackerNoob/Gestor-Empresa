/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import models.Service;
import repositories.RepositoryServicesImpl;

/**
 *
 * @author blackhawk
 */
public class Mamberroi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RepositoryServicesImpl services = new RepositoryServicesImpl();
        services.addService(new Service("hbo","Family", 360));
        services.addService(new Service("netflix","Family", 360));
        services.addService(new Service("disney","Family", 360));
//        services.deleteService(1);
        services.updateService(1, new Service("starlink","uwu", 360));
        services.getService(0);
        services.getServices();
    }
}
