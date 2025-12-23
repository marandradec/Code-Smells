package Couplers;

public class MiddleMan {

    public String getCustomerName(Customer customer) {
        return customer.getName();
    }
}

/* Clase auxiliar */

class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
