package model;

public class Test {
    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        GenericStack<Integer> stack2 = new GenericStack<>();

        stack1.push("a");
        stack1.push("b");
        stack1.push("c");
        stack1.push("d");

        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);

        System.out.println("Stack 1: " + stack1.list()+"\nStack 2: " + stack2.list());
        System.out.println("\nStack1 peek: " + stack1.peek()+"\nStack1 pop: " + stack1.pop());
        System.out.println("Stack2 peek: " + stack2.peek()+"\nStack2 pop: " + stack2.pop());
        System.out.println("\nStack 1: " + stack1.list()+"\nStack 2: " + stack2.list());
        System.out.println("\nStack1 peek: " + stack1.peek()+"\nStack2 peek: " + stack2.peek());

        stack1.push("e");
        stack1.push("f");
        stack1.push("g");
        stack1.push("h");
        stack1.push("i");
        stack1.push("j");
        stack1.push("k");

        System.out.println("\nStack 1: " + stack1.list());

        //The code below triggers the StackFullException for the stack1:
        // stack1.push("l");

        GenericStack<Integer> stack3 = new GenericStack<>();
        //The code below triggers the StackEmptyException for the stack3:
        //stack3.pop();
    }
}
