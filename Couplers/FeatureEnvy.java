package Couplers;

public class FeatureEnvy {

    public void printCustomer(Customer c) {
        System.out.println(c.getName());
        System.out.println(c.getAddress());
    }
}

/* Clase auxiliar */

class Customer {

    private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
