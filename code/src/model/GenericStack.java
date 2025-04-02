package model;

public class GenericStack<E> {
    private E[] elements;
    private int size;
    private int top = 0;

    public GenericStack() {
        elements = (E[]) new Object[10];
        size=10;
    }

    public GenericStack(int size)   {
        elements = (E[]) new Object[size];
        this.size=size;
    }

    public void push(E element) {
        if (top == size) throw new StackFullException();
        else elements[top++] = element;
    }

    public E pop() {
        if(top==0) throw new StackEmptyException();
        else {
            elements[top--]=null;
            return elements[top];
        }
    }

    public E peek() {
        if(top==0) throw new StackEmptyException();
        else return elements[top];
    }

    public String list()    {
        String list="";
        return list;
    }
}
