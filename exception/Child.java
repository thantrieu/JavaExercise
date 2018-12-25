package exception;

public class Child extends Father {
    @Override
    public void showInfo(Object message) throws NullPointerException {
        super.showInfo(message);
        // do something
    }
}
