package exception.user_defined;

public class InvalidAgeException extends Exception {
    private String message;

    public InvalidAgeException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
