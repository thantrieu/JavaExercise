package exception.user_defined;
/*
    Ngoại lệ do người dùng tự định nghĩa
    Goal of this video: write checked exception
 */
public class AgeOfDriver {
    private int age;

    public AgeOfDriver(int age) throws InvalidAgeException {
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if(age < 18){
            throw new InvalidAgeException("Age must be greater or equals 18");
        }else{
            this.age = age;
        }
    }

    public AgeOfDriver() {
    }
}
