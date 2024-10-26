package dz21;

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
        Animal animal1 = new Swordtail("Swordtail");
        Animal animal2 = new Penguin("Penguin");
        Animal animal3 = new Lion("Lion");

        Fish fish1 = new Swordtail("Fish");

        Bird bird1 = new Penguin("Penguin");

        Mammal mammal1 = new Lion("Lion");

        Speakable speakable1 = new Penguin("Penguin");
        Speakable speakable2 = new Lion("Lion");

        Swordtail swordtail1 = new Swordtail("Swordtail");

        Penguin penguin1 = new Penguin("Penguin");

        Lion lion1 = new Lion("Lion");

        Speakable[] speakables = {speakable1, speakable2, mammal1, bird1, penguin1, lion1};
        Animal[] animals = {animal1, animal2, animal3, fish1, bird1, mammal1, swordtail1, penguin1, lion1};

        for (Speakable speakable : speakables) {
            if (speakable instanceof Penguin) {
                Penguin penguin = (Penguin) speakable;
                penguin.eat();
                penguin.sleep();
                penguin.fly();
                penguin.speak();
            } else if (speakable instanceof Lion) {
                Lion lion = (Lion) speakable;
                lion.eat();
                lion.sleep();
                lion.run();
                lion.speak();
            }
        }

        for (Animal animal : animals) {
            if (animal instanceof Penguin) {
                Penguin penguin = (Penguin) animal;
                penguin.eat();
                penguin.sleep();
                penguin.fly();
                penguin.speak();
            } else if (animal instanceof Lion) {
                Lion lion = (Lion) animal;
                lion.eat();
                lion.sleep();
                lion.run();
                lion.speak();
            } else if (animal instanceof Swordtail) {
                Swordtail swordtail = (Swordtail) animal;
                swordtail.swim();
                swordtail.eat();
                swordtail.sleep();
            }
        }
    }
}