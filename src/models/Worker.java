package models;

public class Worker {
    private String name;
    private int phone;
    private String contract;

    public Worker(String name, int phone, String contract) {
        this.name = name;
        this.phone = phone;
        this.contract = contract;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }
}
