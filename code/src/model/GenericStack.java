package model;

public class GenericStack<E> {
    private E[] elements;
    private int size;

    public GenericStack() {
        elements = (E[]) new Object[10];
        size = 10;
    }

    public GenericStack(int size)   {
        elements = (E[]) new Object[size];
        this.size = size;
    }

    public void push(E element) {

    }

    public E pop() {
        return null;
    }

    public E peek() {
        return null;
    }

    public String list()    {
        String list="";
        return list;
    }
}
