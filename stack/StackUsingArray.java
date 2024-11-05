package stack;

import java.util.*;

public class StackUsingArray {
    private int[] stackArr;
    private int top;
    private int capacity;
    public StackUsingArray(int size){
        stackArr = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int n){
        if(isFull()){
            System.out.println("Stack Overflow! Cannot push " + n);
            return;
        }
        else{
            stackArr[++top] = n;
            System.out.println("Pushed " + n + " to the stack.");
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }
        else{
            return stackArr[top--];
        }
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to peek.");
            return -1;
        }
        return stackArr[top];  
    }
    public boolean isEmpty() {
        return top == -1;  // Stack is empty when top is -1
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;  // Stack is full when top is at last index
    }
}

class Main {
    public static void main(String[] args) {
        StackUsingArray myStack = new StackUsingArray(5);
        
        myStack.push(10);  // Pushed 10 to the stack
        myStack.push(20);  // Pushed 20 to the stack
        myStack.push(30);  // Pushed 30 to the stack
        myStack.push(40);  // Pushed 40 to the stack
        myStack.push(50);  // Pushed 50 to the stack
        
        // Try to push into a full stack
        myStack.push(60);  // Should print "Stack Overflow!"
        
        // Test peek operation
        System.out.println("Peeked: " + myStack.peek());  // Should return the top value (50)
        
        
        myStack.pop();  // Should pop 50
        myStack.pop();  // Should pop 40
        
        // Peek again after popping
        System.out.println("Peeked: " + myStack.peek());  // Should return 30
        
        // Test isEmpty and isFull
        System.out.println("Is the stack empty? " + myStack.isEmpty());  // Should return false
        System.out.println("Is the stack full? " + myStack.isFull());    // Should return false
        
        // Empty the stack
        myStack.pop();  // Pop 30
        myStack.pop();  // Pop 20
        myStack.pop();  // Pop 10
        
        // Try to pop from an empty stack
        myStack.pop();  // Should print "Stack Underflow!"
        
        // Check if the stack is empty
        System.out.println("Is the stack empty? " + myStack.isEmpty());  // Should return true
    }
}
