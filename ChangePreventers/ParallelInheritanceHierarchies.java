package ChangePreventers;

public class ParallelInheritanceHierarchies {
    // Por cada nueva clase de dominio, se debe crear una clase paralela
    class Car {
        public void drive() {
            System.out.println("Car driving");
        }
    }

    class CarController {
        public void controlCar() {
            System.out.println("Controlling car");
        }
    }

    class Truck {
        public void drive() {
            System.out.println("Truck driving");
        }
    }

    class TruckController {
        public void controlTruck() {
            System.out.println("Controlling truck");
        }
    }

    // Si mañana se agrega:
    // class Motorcycle { ... }
    // class MotorcycleController { ... }
    // La jerarquía crece en paralelo.
}
