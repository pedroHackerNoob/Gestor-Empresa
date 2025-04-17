package repositories;

import models.Supplier;

import java.util.ArrayList;

public class RepositorySuppliersImpl {
    private static final ArrayList<Supplier> suppliers = new ArrayList<>();

    public static void getSuppliers() {
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

    public static void getSupplier(int id) {
        System.out.println(
                suppliers.get(id).getCompany()
                +" "+suppliers.get(id).getContract()
                +" "+suppliers.get(id).getPhone());
    }

    public static void addSupplier(Supplier supplier) {
        suppliers.add(supplier);
    }

    public static void updateSupplier(int id, Supplier supplier) {
        suppliers.set(id, supplier);
    }

    public static void deleteSupplier(int id) {
        suppliers.remove(id);
    }
}
