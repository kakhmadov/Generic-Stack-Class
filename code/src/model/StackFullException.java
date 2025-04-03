package model;

/**
 * This class represents the StackFullException, which is supposed to be thrown, when
 * an element is added into a full stack.
 * @author Akhmadov Khasu
 * @version 2025-04-03
 */
public class StackFullException extends RuntimeException {
    /**
     * Default constructor
     */
    public StackFullException() {super("Stack is full");}

    /**
     * Constructor with parameter.
     * @param message Sets the error message.
     */
    public StackFullException(String message) {
        super(message);
    }
}
