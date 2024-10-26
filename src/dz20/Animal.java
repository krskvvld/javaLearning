package dz20;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract public void eat();

    abstract public void sleep();
}

abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        System.out.println("Fish sleep");
    }

    abstract public void swim();
}

abstract class Bird extends Animal implements Speakable {
    public Bird(String name) {
        super(name);
    }

    abstract public void fly();

    @Override
    public void speak() {
        System.out.println("Bird sing");
    }
}

abstract class Mammal extends Animal implements Speakable {
    public Mammal(String name) {
        super(name);
    }

    abstract public void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speak");
    }
}

class Swordtail extends Fish {
    public Swordtail(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Swordtail swim");
    }

    @Override
    public void eat() {
        System.out.println("Swordtail eat");
    }
}

class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Penguin eat");
    }

    @Override
    public void sleep() {
        System.out.println("Penguin sleep");
    }

    @Override
    public void fly() {
        System.out.println("Penguin can't fly");
    }

    @Override
    public void speak() {
        System.out.println("Penguin can't sing");
    }
}

class Lion extends Mammal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Lion eat");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleep");
    }

    @Override
    public void run() {
        System.out.println("Lion run");
    }
}

class Test {
    public static void main(String[] args) {
        Swordtail swordtail = new Swordtail("Swordtail");
        System.out.println(swordtail.name);
        swordtail.eat();
        swordtail.sleep();
        swordtail.swim();

        System.out.println();

        Speakable speakable = new Penguin("Penguin");
        speakable.speak();

        System.out.println();

        Animal animal = new Lion("Lion");
        System.out.println(animal.name);
        animal.eat();
        animal.sleep();

        System.out.println();

        Mammal mammal = new Lion("Lion");
        System.out.println(mammal.name);
        mammal.eat();
        mammal.sleep();
        mammal.run();
        mammal.speak();
    }
}