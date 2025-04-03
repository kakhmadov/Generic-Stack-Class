package model;

import java.util.EmptyStackException;

/**
 * This class demonstrates a generic stack class.
 * @author Akhmadov Khasu
 * @version 2025-04-03
 * @param <E> A type-parameter which enables the usage of generics.
 */
public class GenericStack<E> {
    private E[] elements;
    private int size;
    private int top = 0;

    /**
     * Default constructor, which creates a Generic-Array with
     * the size 10.
     */
    public GenericStack() {
        elements = (E[]) new Object[10];
        size=10;
    }

    /**
     * Constructor with the parameter "size", to determine the
     * size of the Generic-Array
     * @param size An integer value to set the amount of elements
     *             for the Generic-Array.
     */
    public GenericStack(int size)   {
        elements = (E[]) new Object[size];
        this.size=size;
    }

    /**
     * This method allows to push a new element into the
     * Generic-Array. The elements are stacked on top of
     * each other.
     * @param element An element that is to be added to the
     *                Generic-Array.
     * @throws StackFullException Is thrown, when the programm tries
     * to add a new element into a full Generic-Stack.
     */
    public void push(E element) throws StackFullException {
        if (top == size) throw new StackFullException();
        else elements[top++] = element;
    }

    /**
     * This method removes the element at the very top of the
     * Generic-Array. It functions by the stack principle.
     * @return Returns the last removed element from the Generic-Array.
     * @throws StackEmptyException Is thrown, when the programm tries to remove
     * an element from an empty Generic-Array.
     */
    public E pop() throws StackEmptyException {
        if(top==0) throw new StackEmptyException();
        else {
            E r=elements[top-1];
            elements[top-1]=null;
            top-=1;
            return r;
        }
    }

    /**
     * This method allows the programm to return the very top element in a
     * Generic-Array.
     * @return Returns the very top element from a Generic-Array.
     * @throws StackEmptyException Is thrown, when the programm tries to return
     * the very top element from an empty Generic-Array.
     */
    public E peek() throws StackEmptyException {
        if(top==0) throw new StackEmptyException();
        else return elements[top-1];
    }

    /**
     * This method concatenates the elements from the Generic-Array, this method
     * is applied to, as a String and returns it.
     * @return Returns all the elements from the Generic-Array as a String.
     */
    public String list()    {
        String list="";
        if(top!=0) {
            for (E e : elements)
                if (e!=null || top!=size) {
                    list = list + e+";";
                }
                else return list;
        }
        else throw new StackEmptyException();
        return list;
    }
}
