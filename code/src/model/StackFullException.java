package model;

public class StackFullException extends RuntimeException {
    public StackFullException() {super("Stack is full");}
    public StackFullException(String message) {
        super(message);
    }
}
