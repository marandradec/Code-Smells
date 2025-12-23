package Couplers;

public class MessageChains {

    // 🦨 Mal olor: Message Chains
    public String getCity(Order order) {
        return order.getCustomer().getAddress().getCity();
    }
}

/* Clases auxiliares */

class Order {

    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}

class Customer {

    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}

class Address {

    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
