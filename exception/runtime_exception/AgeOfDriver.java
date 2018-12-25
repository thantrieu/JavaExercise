package exception.runtime_exception;

public class AgeOfDriver {
    private int age;

    public AgeOfDriver(int age) throws InvalidAgeException{
        setAge(age);
    }

    public AgeOfDriver() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if(age >= 16){
            this.age = age;
        }else{
            throw new InvalidAgeException("Age must greater than or equals 16");
        }
    }
}
