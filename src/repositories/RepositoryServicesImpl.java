package repositories;

import controllers.AritmeticImpl;
import models.Service;

import java.util.ArrayList;

public class RepositoryServicesImpl{
     private static final ArrayList<Service> services = new ArrayList<>();
    public static void getServices() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++  Lista de Servicios  ++++++++++++");
        int idTemp =0;
        for (Service service : services) {
            System.out.println(AritmeticImpl.Subtotal(idTemp,service.getName(),service.getPrice(),service.getStock()));;
            idTemp++;
        }
    }

    public static void addService(Service service) {
        services.add(service);
    }

    public static void getService(int id) {
        System.out.println(services.get(id).getName()+" "+services.get(id).getPrice()+" "+services.get(id).getStock());
    }

    public static void updateService(int id, Service service) {
        services.set(id, service);
    }

    public static void deleteService(int id) {
        services.remove(id);
    }
}
