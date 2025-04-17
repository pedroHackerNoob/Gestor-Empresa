package repositories;

import models.Worker;

import java.util.ArrayList;

public class RepositoryWorkersImpl {
    private static final ArrayList<Worker> workers = new ArrayList<>();

    public static void getWorkers() {
        System.out.println("Lista de workers");
        int idTemp=0;
        for (Worker worker : workers) {
            System.out.println(idTemp+" "
                    +worker.getName()+" "
                    +worker.getPhone()+" "
                    +worker.getContract());
            idTemp++;
        }
    }

    public static void addWorker(Worker worker) {
        workers.add(worker);
    }

    public static void getWorker(int id) {
        System.out.println(workers.get(id).getName()+": "
                +workers.get(id).getPhone()+" "
                +workers.get(id).getContract());
    }

    public static void updateWorker(int id, Worker worker) {
        workers.set(id, worker);
    }

    public static void deleteWorker(int id) {
        workers.remove(id);
    }
}
