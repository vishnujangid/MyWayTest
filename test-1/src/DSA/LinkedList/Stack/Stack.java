package DSA.LinkedList.Stack;

/**
 * Created by Vishnu.jangid on 30/04/2020 AD .
 */

public class Stack {
    int stack[];
    int top = 0;
    int capacity = 2;
    
    public Stack() {
        stack = new int[capacity];
    }
    
    public Stack(int size) {
        capacity = size;
        stack = new int[capacity];
    }
    
    public void push(int item) {
        if (top == capacity)
            expand();
        
        stack[top] = item;
        top++;
        
    }
    
    private void expand() {
        capacity *= 2;
        int newStack[] = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, size());
        stack = newStack;
    }
    
    public void pop() {
        if (top == 0) {
            System.out.println("Stack Empty");
        } else {
            if (top <= capacity / 4)
                shrink();
            top--;
        }
    }
    
    private void shrink() {
        capacity /= 2;
        int newStack[] = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, top);
        stack = newStack;
    }
    
    public int peek() {
        System.out.println(stack[top - 1]);
        return stack[top - 1];
    }
    
    public int size() {
        return top;
    }
    
    public boolean isEmpty() {
        return top == 0;
    }
    
    public void show() {
        for (int i = 0; i < top; i++) {
            System.out.print(stack[i] + " ");
        }
        
    }
    
}
