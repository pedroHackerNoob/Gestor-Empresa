package models;

public class Supplier {
    private String name;
    private String company;
    private String contract;
    private String address;
    private int phone;

    public Supplier(String name, String company, String contract, String address, int phone) {
        this.name = name;
        this.company = company;
        this.contract = contract;
        this.address = address;
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
