package DSA.LinkedList.LinkedList;

/**
 * Created by Vishnu.jangid on 29/04/2020 AD .
 */

public class Node<E> {
    E data;
    Node next;
    
    public E getData() {
        return data;
    }
    
    public void setData(E data) {
        this.data = data;
    }
    
    public Node getNext() {
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
}
