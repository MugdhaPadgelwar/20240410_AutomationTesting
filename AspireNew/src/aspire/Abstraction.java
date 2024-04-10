package aspire;

abstract class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println(name + " is eating.");
    }
}

// Concrete class extending abstract class
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name);
    }

    // Implementation of abstract method
    void sound() {
        System.out.println(name + " barks.");
    }
}

// Concrete class extending abstract class
class Cat extends Animal {
    // Constructor
    public Cat(String name) {
        super(name);
    }

    // Implementation of abstract method
    void sound() {
        System.out.println(name + " meows.");
    }
}

// Interface
interface Jumpable {
    void jump();
}

// Interface
interface Swimable {
    void swim();
}

// Concrete class implementing interfaces
class Kangaroo extends Animal implements Jumpable {
    // Constructor
    public Kangaroo(String name) {
        super(name);
    }

    // Implementation of abstract method
    void sound() {
        System.out.println(name + " makes a boing sound.");
    }

    // Implementation of interface method
    public void jump() {
        System.out.println(name + " is jumping.");
    }
}

// Concrete class implementing interfaces
class Dolphin extends Animal implements Swimable {
    // Constructor
    public Dolphin(String name) {
        super(name);
    }

    // Implementation of abstract method
    void sound() {
        System.out.println(name + " whistles.");
    }

    // Implementation of interface method
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}





























public class Abstraction {

	public static void main(String[] args) {
		
		 Dog dog = new Dog("Buddy");
	        Cat cat = new Cat("Whiskers");
	        Kangaroo kangaroo = new Kangaroo("Joey");
	        Dolphin dolphin = new Dolphin("Flipper");

	        // Calling methods
	        dog.sound();
	        dog.eat();

	        cat.sound();
	        cat.eat();

	        kangaroo.sound();
	        kangaroo.jump();

	        dolphin.sound();
	        dolphin.swim();
	}

}
