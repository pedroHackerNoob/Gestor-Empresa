package repositories;

import models.Worker;
import java.util.List;

public interface RepositoryWorkers {
    public void getWorkers();
    public void addWorker(Worker worker);
    public void getWorker(int id);
    public void updateWorker(int id, Worker worker);
    public void deleteWorker(int id);
}
