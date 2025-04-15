package repositories;

import models.Supplier;

public interface RepositorySuppliers {
    public void getSuppliers();
    public void getSupplier(int id);
    public void addSupplier(Supplier supplier);
    public void updateSupplier(int id, Supplier supplier);
    public void deleteSupplier(int id);
}
