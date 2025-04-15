package models;

public class Service {
    String name;
    String pack;
    int price;

    public Service(String name, String pack, int price) {
        this.name = name;
        this.pack = pack;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
