package stack;

public class DynamicStack {
    private int[] stackArray;  // Array to store stack elements
    private int top;           // Pointer to track the top of the stack
    private int capacity;      // Current capacity of the stack

    // Constructor to initialize the stack with an initial size
    public DynamicStack(int initialSize) {
        stackArray = new int[initialSize];  // Start with a small array
        capacity = initialSize;             // Set initial capacity
        top = -1;                           // Initially, the stack is empty
    }

    // Push an element onto the stack, resizing if needed
    public void push(int value) {
        // If the array is full, resize it
        if (isFull()) {
            resize();
        }
        stackArray[++top] = value;  // Increment top and add the element
        System.out.println("Pushed " + value + " to the stack.");
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;  // Or throw an exception
        }
        System.out.println("Popped " + stackArray[top]);
        return stackArray[top--];  // Return the top element and decrement top
    }

    // Peek the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to peek.");
            return -1;
        }
        return stackArray[top];  // Return the top element
    }

    // Helper method to resize the array when full
    private void resize() {
        int newCapacity = capacity * 2;  // Double the current capacity
        System.out.println("Resizing stack from " + capacity + " to " + newCapacity);

        int[] newArray = new int[newCapacity];  // Create a new array with the new capacity
        // Copy elements from the old array to the new array
        for (int i = 0; i < capacity; i++) {
            newArray[i] = stackArray[i];
        }
        stackArray = newArray;  // Replace the old array with the new one
        capacity = newCapacity;  // Update the capacity
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;  // Stack is empty when top is -1
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;  // Stack is full when top is at the last index
    }

    // Get current size of the stack
    public int size() {
        return top + 1;  // The number of elements in the stack
    }
}

class Main {
    public static void main(String[] args) {
        // Create a dynamic stack with an initial capacity of 2
        DynamicStack myStack = new DynamicStack(2);

        // Test pushing elements (will trigger resizing)
        myStack.push(10);  // Pushed 10
        myStack.push(20);  // Pushed 20

        // Triggering a resize (capacity will be doubled)
        myStack.push(30);  // Resizing stack, Pushed 30
        myStack.push(40);  // Pushed 40

        // Test peek
        System.out.println("Peeked: " + myStack.peek());  // Should return 40

        // Test pop
        myStack.pop();  // Should pop 40
        myStack.pop();  // Should pop 30

        // Test peek after pop
        System.out.println("Peeked: " + myStack.peek());  // Should return 20

        // Continue popping
        myStack.pop();  // Should pop 20
        myStack.pop();  // Should pop 10

        // Try to pop from an empty stack
        myStack.pop();  // Should show "Stack Underflow!"
    }
}
