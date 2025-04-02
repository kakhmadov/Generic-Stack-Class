package model;

public class StackEmptyException extends RuntimeException {
    public StackEmptyException() {super("Stack is empty");}
    public StackEmptyException(String message) {
        super(message);
    }
}
