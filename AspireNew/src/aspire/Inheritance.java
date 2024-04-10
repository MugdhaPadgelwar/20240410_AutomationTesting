package aspire;
// Parent class
class Vehicle {
    String brand;
    int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

// Subclass inheriting from Vehicle class
class Car extends Vehicle {
    int mileage;

    // Constructor
    public Car(String brand, int year, int mileage) {
        super(brand, year); // Call to superclass constructor
        this.mileage = mileage;
    }

    // Method overriding
    @Override
    void displayInfo() {
        super.displayInfo(); // Call to superclass method
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Creating an object of the subclass
        Car car = new Car("Toyota", 2020, 15);

        // Calling method of the subclass
        car.displayInfo();
    }
}
