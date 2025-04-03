package model;

/**
 * This class represents the StackEmptyException, which is supposed to be thrown, when
 * a stack is empty.
 * @author Akhmadov Khasu
 * @version 2025-04-03
 */
public class StackEmptyException extends RuntimeException {
    /**
     * Default constructor
     */
    public StackEmptyException() {super("Stack is empty");}
    /**
     * Constructor with parameter.
     * @param message Sets the error message.
     */
    public StackEmptyException(String message) {
        super(message);
    }
}
