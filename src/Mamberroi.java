/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import models.Supplier;
import models.Worker;
import repositories.RepositorySuppliersImpl;
import repositories.RepositoryWorkersImpl;

/**
 *
 * @author blackhawk
 */
public class Mamberroi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RepositoryWorkersImpl repositoryWorkers = new RepositoryWorkersImpl();
        repositoryWorkers.addWorker(new Worker("pedro", 132, "xyz"));
        repositoryWorkers.addWorker(new Worker("chato", 132, "xyz"));
        repositoryWorkers.addWorker(new Worker("rayo", 132, "xyz"));
//        repositoryWorkers.deleteWorker(1);
        repositoryWorkers.updateWorker(2, new Worker("troyano", 132, "xyz"));
//        repositoryWorkers.getWorker(2);
        repositoryWorkers.getWorkers();

    }
}
