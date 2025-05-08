package models;

public class Product {
    private String name;
    private double price;
    private int stock;
    private double subTotal;
    private String status;

    public Product(String name, double price, int stock, double subTotal, String status) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.subTotal = subTotal;
        this.status = status;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
