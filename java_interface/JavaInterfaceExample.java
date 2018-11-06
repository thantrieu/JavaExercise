package java_interface;

// interface trong java
//mục đích: đạt đc tính trừu tượng hoàn toàn

public class JavaInterfaceExample {
    public static void main(String[] args) {
        Animal animal = new Fish();
        var animal1 = new Cat();
        var animal2 = new Dog();

        animal1.sleep();
        animal2.sleep();
        animal.move();

    }
}
