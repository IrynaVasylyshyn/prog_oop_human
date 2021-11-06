package human.exceptions;

public class StudentException extends Exception {
    @Override
    public String getMessage() {
        return "Cannot add Student to group. Group is full";
    }
}
