package model;

/**
 * Test class to test the methods from the GenericStack.java class.
 * @author Akhmadov Khasu
 * @version 2025-04-03
 */
public class Test {
    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();     //Declare & Initialize new GenericStack [size 10]
        GenericStack<Integer> stack2 = new GenericStack<>();    //Declare & Initialize new GenericStack [size 10]

        stack1.push("a");   //element 1: Pushed a new element into "stack1"
        stack1.push("b");   //element 2: Pushed a new element into "stack1"
        stack1.push("c");   //element 3: Pushed a new element into "stack1"
        stack1.push("d");   //element 4: Pushed a new element into "stack1"

        stack2.push(1);     //element 1: Pushed a new element into "stack2"
        stack2.push(2);     //element 2: Pushed a new element into "stack2"
        stack2.push(3);     //element 3: Pushed a new element into "stack2"
        stack2.push(4);     //element 4: Pushed a new element into "stack2"

        //Lists the elements from "stack1" & "stack2" as a String
        System.out.println("Stack 1: " + stack1.list()+"\nStack 2: " + stack2.list());
        //Peeks the very top element of stack1 and then removes it
        System.out.println("\nStack1 peek: " + stack1.peek()+"\nStack1 pop: " + stack1.pop());
        //Peeks the very top element of stack2 and then removes it
        System.out.println("Stack2 peek: " + stack2.peek()+"\nStack2 pop: " + stack2.pop());
        //Lists the elements from "stack1" & "stack2" as a String
        System.out.println("\nStack 1: " + stack1.list()+"\nStack 2: " + stack2.list());
        //Peeks the very top element of both stacks
        System.out.println("\nStack1 peek: " + stack1.peek()+"\nStack2 peek: " + stack2.peek());

        stack1.push("e");       //element 4 (bc the previous one was popped):
                                        //Pushed a new element into "stack1"
        stack1.push("f");       //element 5: Pushed a new element into "stack1"
        stack1.push("g");       //element 6: Pushed a new element into "stack1"
        stack1.push("h");       //element 7: Pushed a new element into "stack1"
        stack1.push("i");       //element 8: Pushed a new element into "stack1"
        stack1.push("j");       //element 9: Pushed a new element into "stack1"
        stack1.push("k");       //element 10: Pushed a new element into "stack1"

        System.out.println("\nStack 1: " + stack1.list());  //Lists the elements from "stack"

        //The code below triggers the StackFullException for the stack1:
        // stack1.push("l");

        GenericStack<Integer> stack3 = new GenericStack<>();
        //The code below triggers the StackEmptyException for the stack3:
        //stack3.pop();
    }
}
