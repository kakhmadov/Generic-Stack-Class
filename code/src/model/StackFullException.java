package model;

public class StackFullException extends RuntimeException {
    public StackFullException(String message) {
        super(message);
    }
}
