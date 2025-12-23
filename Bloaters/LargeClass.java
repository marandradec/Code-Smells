public class LargeClass {

    // Datos de pedido
    private int orderId;
    private double totalAmount;
    private String orderDate;

    // Datos del cliente
    private String customerName;
    private String customerAddress;
    private String customerPhone;
    private String customerEmail;

    // Datos de envío
    private String shippingAddress;
    private double shippingCost;
    private boolean shipped;

    // Lógica mezclada
    public void calculateTotal() {
        // cálculo ficticio
        totalAmount = totalAmount + shippingCost;
    }

    public void printOrder() {
        System.out.println("Order #" + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Total: " + totalAmount);
    }
}
