package repositories;

import models.Client;

import java.util.ArrayList;

public class RepositoryCustomersImpl implements RepositoryCustomers{
    private ArrayList<Client> clients = new ArrayList<Client>();

    @Override
    public void getCustomers() {
        System.out.println("Lista de clientes");
        int idtemp =0;
        for (Client client : clients) {
            System.out.println(idtemp+" "+client.getName());
            idtemp++;
        }
    }

    @Override
    public void getCustomer(int id) {
    }

    @Override
    public void addCustomer(Client client) {
        this.clients.add(client);
    }

    @Override
    public void updateCustomer(Client client) {
        clients.set(clients.indexOf(client), client);
    }

    @Override
    public void deleteCustomer(int id) {
        clients.remove(id-1);
    }
}
