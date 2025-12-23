package ChangePreventers;

public class ShotgunSurgery {
    // Cambiar el formato de fecha obliga a modificar MUCHOS métodos
    public String formatOrderDate(String date) {
        // Formato: DD/MM/YYYY
        return date.substring(8, 10) + "/" +
               date.substring(5, 7) + "/" +
               date.substring(0, 4);
    }

    public String formatInvoiceDate(String date) {
        // Mismo formato repetido
        return date.substring(8, 10) + "/" +
               date.substring(5, 7) + "/" +
               date.substring(0, 4);
    }

    public String formatShippingDate(String date) {
        // Mismo formato repetido otra vez
        return date.substring(8, 10) + "/" +
               date.substring(5, 7) + "/" +
               date.substring(0, 4);
    }

    public String formatPaymentDate(String date) {
        // Y otra vez más…
        return date.substring(8, 10) + "/" +
               date.substring(5, 7) + "/" +
               date.substring(0, 4);
    }

    public void printDates(String orderDate, String invoiceDate,
                           String shippingDate, String paymentDate) {

        System.out.println("Order date: " + formatOrderDate(orderDate));
        System.out.println("Invoice date: " + formatInvoiceDate(invoiceDate));
        System.out.println("Shipping date: " + formatShippingDate(shippingDate));
        System.out.println("Payment date: " + formatPaymentDate(paymentDate));
    }
}
