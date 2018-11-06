package java_interface;

import java.io.Serializable;

public class Dog implements Animal, Serializable, Comparable<Dog> {
    @Override
    public void move() {
        System.out.println("Dogs move by his hands");
    }

    @Override
    public void eat() {
        System.out.println("Dogs eat rices");
    }

    @Override
    public void sleep() {
        System.out.println("Dogs sleep in daylight");
    }

    @Override
    public int compareTo(Dog o) {
        return 0;
    }
}
