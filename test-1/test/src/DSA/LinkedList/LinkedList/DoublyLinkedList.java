package DSA.LinkedList.LinkedList;

/**
 * Created by Vishnu.jangid on 30/04/2020 AD .
 */

public class DoublyLinkedList<E> {
    Node<E> head;
    
    static class Node<E> {
        E data;
        Node<E> prev;
        Node<E> next;
        
    }
    
    public void add(E item) {
        Node<E> node = new Node<E>();
        node.data = item;
        if (head == null) {
            head = node;
        } else {
            Node<E> n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
            node.prev = n;
        }
    }
    
    public void show() {
        Node<E> n = head;
        System.out.print("Elements :");
        while (n.next != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.print(n.data + " ");
    }
    
    public void reversePrint(Node<E> node) {
        Node<E> n = node;
        if (n.next != null) {
            reversePrint(n.next);
        }
        System.out.print(n.data + " ");
    }
    
    public void reverse() {
        Node<E> head_ref= head;
        Node<E> temp = null;
        Node<E> current = head_ref;
        
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        
        if (temp != null)
            head_ref = temp.prev;
        
        head = head_ref;
        
    }
    
}
