package DSA.LinkedList.LinkedList;

/**
 * Created by Vishnu.jangid on 02/05/2020 AD .
 */

public class CircularLinkedList {
    Node last;
    int length;
    
    public CircularLinkedList() {
        last = null;
        length = 0;
    }
    
    public void add(int data) {
        Node node = new Node();
        node.data = data;
        if (last == null) {
            last = node;
            node.next = last;
            length++;
        } else {
            node.next = last.next;
            last.next = node;
            last = node;
            length++;
        }
    }
    
    public void show() {
        if (last == null)
            System.out.println("List is empty");
        else {
            Node n = last.next;
            while (n != last) {
                System.out.print(n.data);
                n = n.next;
            }
            System.out.println(n.data);
        }
        
    }
    
}
