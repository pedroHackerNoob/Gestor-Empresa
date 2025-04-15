package repositories;

import models.Product;

public interface RepositoryProduct {
    public void getProducts();
    public void getProduct(int id);
    public void addProduct(Product product);
    public void updateProduct(int id, Product product);
    public void deleteProduct(int product);
}
