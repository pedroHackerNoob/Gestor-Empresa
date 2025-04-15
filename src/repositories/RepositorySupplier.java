package repositories;

import models.Supplier;

import java.util.ArrayList;

public interface RepositorySupplier {
    public void getSuppliers();
    public void getSupplier(int id);
    public void addSupplier(Supplier supplier);
    public void updateSupplier(int id, Supplier supplier);
    public void removeSupplier(int id);
}
