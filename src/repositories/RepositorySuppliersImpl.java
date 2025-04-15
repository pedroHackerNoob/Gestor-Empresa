package repositories;

import models.Supplier;

import java.util.ArrayList;

public class RepositorySuppliersImpl implements RepositorySuppliers {
    private final ArrayList<Supplier> suppliers = new ArrayList<>();

    @Override
    public void getSuppliers() {
        System.out.println("Lista de suplementarios");
        int idtemp =0;
        for (Supplier supplier : suppliers) {
            System.out.println(idtemp
                    +" "+supplier.getName()
                    +" company"+supplier.getCompany()
                    +" phone: "+supplier.getPhone()
                    +" address:"+supplier.getAddress()
                    +" contract"+supplier.getContract());
            idtemp++;
        }
    }

    @Override
    public void getSupplier(int id) {
        System.out.println(
                suppliers.get(id).getCompany()
                +" "+suppliers.get(id).getContract()
                +" "+suppliers.get(id).getPhone());
    }

    @Override
    public void addSupplier(Supplier supplier) {
        this.suppliers.add(supplier);
    }

    @Override
    public void updateSupplier(int id, Supplier supplier) {
        this.suppliers.set(id, supplier);
    }

    @Override
    public void deleteSupplier(int id) {
        this.suppliers.remove(id);
    }
}
