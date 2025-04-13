package repositories;

import models.Client;

public interface RepositoryCLients {
    public void getClients();
    public void getClient(int id);
    public void addClient(Client client);
    public void updateClient(int id, Client client);
    public void deleteClient(int client);
}
