package repositories;

import models.Worker;

import java.util.ArrayList;

public class RepositoryWorkersImpl implements RepositoryWorkers {
    private final ArrayList<Worker> workers = new ArrayList<>();

    @Override
    public void getWorkers() {
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

    @Override
    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    @Override
    public void getWorker(int id) {
        System.out.println(workers.get(id).getName()+": "
                +workers.get(id).getPhone()+" "
                +workers.get(id).getContract());
    }

    @Override
    public void updateWorker(int id, Worker worker) {
        workers.set(id, worker);
    }

    @Override
    public void deleteWorker(int id) {
        workers.remove(id);
    }
}
