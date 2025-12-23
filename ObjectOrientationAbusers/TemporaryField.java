package ObjectOrientationAbusers;

public class TemporaryField {
    // Este atributo solo se usa en un método
    private double tempDiscount;

    public void calculateDiscount(boolean isVip) {
        if (isVip) {
            tempDiscount = 0.2;
        }
    }
}
