package repositories;

import models.Client;

import java.util.ArrayList;

public class RepositoryClientsImpl {
    private static final ArrayList<Client> clients = new ArrayList<>();

    public static void getClients() {
        System.out.println("Lista de clientes");
        int idtemp =0;
        for (Client client : clients) {
            System.out.println("##########################");
            System.out.println("### "+idtemp+" Cliente: "+client.getName()+" ##");
            System.out.println("##########################");
            idtemp++;
        }
    }

    public static void getClient(int id) {
        System.out.println("#######################");
        System.out.println("Cliente: "+clients.get(id).getName());
        System.out.println("#######################");
    }

    public static void addClient(Client client) {
        clients.add(client);
    }

    public static void updateClient(int id, Client client) {
        System.out.println("\nEditando cliente");
        clients.set(id, client);
    }

    public static void deleteClient(int id) {
        clients.remove(id);
    }
}
