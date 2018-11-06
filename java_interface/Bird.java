package java_interface;

public abstract class Bird implements Animal {

    @Override
    public void move() {
        System.out.println("Bird move by flying");
    }
}
