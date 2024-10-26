package dz19;

public class Animal {
    private int eyes;

    public Animal() {
        System.out.println("I am an animal");
    }

    public void eat() {
        System.out.println("Animal eat");
    }

    public void drink() {
        System.out.println("Animal drink");
    }
}

class Pet extends Animal {
    private int eyes = 2;
    private String name;
    private int tail = 1;
    private int paw = 4;

    public Pet() {
        System.out.println("I am a pet");
    }

    public void run() {
        System.out.println("Pet run");
    }

    public void jump() {
        System.out.println("Pet jump");
    }

    public int getPaw() {
        return paw;
    }
}

class Dog extends Pet {
    public Dog(String name) {
        System.out.println("I am a dog and my name: " + name);
    }

    public void play() {
        System.out.println("Dog play");
    }
}

class Cat extends Pet {
    public Cat(String name) {
        System.out.println("I am a cat and my name: " + name);
    }

    public void sleep() {
        System.out.println("Cat sleep");
    }
}

class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog");
        System.out.println(dog.getPaw());

        Cat cat = new Cat("Cat");
        cat.sleep();
    }
}