package exception.user_defined;

public class TestException {
    public static void main(String[] args) throws InvalidAgeException {
        AgeOfDriver ageOfDriver;
        ageOfDriver = new AgeOfDriver(12);
        System.out.println(ageOfDriver.getAge());

    }
}
