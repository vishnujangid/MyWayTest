package DSA.LinkedList.Stack;

/**
 * Created by Vishnu.jangid on 30/04/2020 AD .
 */

public class Runner {
    public static void main(String[] args) {
        Stack stack= new Stack();
        stack.push(1);
        stack.show();
        stack.push(2);
        stack.show();
        System.out.println("Size : "+stack.size());
        stack.push(3);
        stack.show();
        System.out.println("Size : "+stack.size());
        stack.push(4);
        stack.show();
        System.out.println("Size : "+stack.size());
        stack.push(5);
        stack.show();
        System.out.println("Size : "+stack.size());
        stack.push(51);
        stack.show();
    
        System.out.println("=======================>Poping");
        stack.pop();
        stack.show();
        System.out.println("Size : "+stack.size());
        stack.pop();
        stack.show();
        System.out.println("Size : "+stack.size());
        stack.pop();
        stack.show();
        System.out.println("Size : "+stack.size());
        stack.pop();
        stack.show();
        System.out.println("Size : "+stack.size());
        stack.pop();
        stack.show();
        
        
    }
}
