package ObjectOrientationAbusers;

public class SwitchStatements {
    public void pay(String type) {
        switch (type) {
            case "CREDIT":
                System.out.println("Paying with credit card");
                break;
            case "PAYPAL":
                System.out.println("Paying with PayPal");
                break;
        }
    }

}