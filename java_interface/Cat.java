package java_interface;

public class Cat implements Animal {
    @Override
    public void move() {
        System.out.println("Run as fast as possible.");
    }

    @Override
    public void eat() {
        System.out.println("Cat like Mose");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep any where he like");
    }
}
