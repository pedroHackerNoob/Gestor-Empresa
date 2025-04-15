package repositories;

import models.Service;



public interface RepositoryServices {
    public void getServices();
    public void addService(Service service);
    public void getService(int id);
    public void updateService(int id,Service service);
    public void deleteService(int id);
}
