package Couplers;

public class InappropriateIntimacy {
    // Las clases acceden directamente a los datos internos de otras

    class Customer {
        public String name;      // atributo público
        public String email;     // atributo público
    }

    class Order {
        public void printCustomer(Customer customer) {
            // Acceso directo a los atributos
            System.out.println(customer.name);
            System.out.println(customer.email);
        }
    }
}
