package ObjectOrientationAbusers;

public class RefusedBequest {
    class Animal {
    public void fly() {}
    }

    class Dog extends Animal {
        // Dog hereda fly(), pero no lo necesita
    }
}
