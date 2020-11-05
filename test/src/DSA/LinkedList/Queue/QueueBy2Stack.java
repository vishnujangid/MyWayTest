package DSA.LinkedList.Queue;


import java.util.Stack;

public class QueueBy2Stack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void eQueue(int item) {
        stack1.push(item);
    }

    public int dQueue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());

            }
        }
        if(stack2.isEmpty())
            return 0;
       return stack2.pop();

    }

}
