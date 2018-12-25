package exception.runtime_exception;

public class Test {
    public static void main(String[] args) {
        try {
            AgeOfDriver ageOfDriver = new AgeOfDriver(20);
            System.out.println("age valid: " + ageOfDriver.getAge());
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
