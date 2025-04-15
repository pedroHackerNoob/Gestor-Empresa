package repositories;

import models.Service;

import java.util.ArrayList;

public class RepositoryServicesImpl implements RepositoryServices{
     private final ArrayList<Service> services = new ArrayList<>();
    @Override
    public void getServices() {
        System.out.println("Lista de Servicos");
        int idTemp =0;
        for (Service service : services) {
            System.out.println(idTemp+" "
                    +service.getName()+" "
                    +service.getPrice()+" "
                    +service.getPack());
            idTemp++;
        }
    }

    @Override
    public void addService(Service service) {
        services.add(service);
    }

    @Override
    public void getService(int id) {
        System.out.println(services.get(id).getName()+" "+services.get(id).getPrice()+" "+services.get(id).getPack());
    }

    @Override
    public void updateService(int id, Service service) {
        services.set(id, service);
    }

    @Override
    public void deleteService(int id) {
        services.remove(id);
    }
}
