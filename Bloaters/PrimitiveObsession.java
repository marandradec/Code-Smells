public class PrimitiveObsession {
    // Muchos conceptos del dominio representados con primitivos

    private String status;        // debería ser enum
    private String customerType;  // debería ser enum
    private int priority;         // valores mágicos (1, 2, 3)
    private String paymentMethod; // debería ser enum

    public PrimitiveObsession(String status, String customerType, int priority, String paymentMethod) {
        this.status = status;
        this.customerType = customerType;
        this.priority = priority;
        this.paymentMethod = paymentMethod;
    }

    public boolean canBeProcessed() {
        if (status.equals("ACTIVE") && priority == 1) {
            return true;
        }
        return false;
    }

    public double applyDiscount(double amount) {
        if (customerType.equals("VIP")) {
            return amount * 0.8;
        }
        return amount;
    }

    public boolean isCreditCardPayment() {
        return paymentMethod.equals("CREDIT_CARD");
    }
}
