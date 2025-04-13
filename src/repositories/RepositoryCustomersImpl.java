package repositories;

import models.Client;

import java.util.ArrayList;

public class RepositoryCustomersImpl implements RepositoryCLients{
    private final ArrayList<Client> clients = new ArrayList<>();

    @Override
    public void getClients() {
        System.out.println("Lista de clientes");
        int idtemp =0;
        for (Client client : clients) {
            System.out.println(idtemp+" "+client.getName());
            idtemp++;
        }
    }

    @Override
    public void getClient(int id) {
        System.out.println(clients.get(id).getName());
    }

    @Override
    public void addClient(Client client) {
        this.clients.add(client);
    }

    @Override
    public void updateClient(int id, Client client) {
        System.out.println("Editando cliente");
        clients.set(id, client);
    }

    @Override
    public void deleteClient(int id) {
        clients.remove(id-1);
    }
}
