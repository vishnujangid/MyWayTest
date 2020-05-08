package DSA.LinkedList.LinkedList;

/**
 * Created by Vishnu.jangid on 29/04/2020 AD .
 */

public class LinkedList<E> {
    Node<E> head;
    
    public LinkedList() {
    }
    public Node<E> getFirst(){
        return head;
    }
    
    public void insert(E e) {
        
        Node<E> node = new Node<E>();
        node.data = e;
        node.next = null;
        
        
        if (this.head == null) {
            head = node;
        } else {
            Node<E> n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }
    
    public void show() {
        try {
            System.out.print("Elements :");
            if (head == null) {
                throw new NullPointerException();
            } else {
                Node<E> n = head;
                while (n.next != null) {
                    System.out.print(n.data);
                    n = n.next;
                }
                System.out.println(n.data);
            }
        } catch (NullPointerException e) {
            System.out.println("List is empty");
        }
        
    }
    
    public E insertAt(int index, E item) {
        int size = size();
        Node<E> node = new Node<>();
        node.data = item;
        node.next = null;
        if (size <= index) {
            Node<E> n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        } else if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node<E> n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
            
        }
        return item;
    }
    
    public int size() {
        int i = 0;
        Node<E> n = head;
        while (n.next != null) {
            n = n.next;
            i++;
        }
        return ++i;
    }
    
    public E insertAtStart(E item) {
        
        Node<E> node = new Node<>();
        node.data = item;
        node.next = head;
        head = node;
        return item;
    }
    
    public E deleteAt(int index) {
        Node<E> node = head;
        if (index == 0) {
            E item = node.data;
            head = node.next;
            return item;
        }
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        Node<E> temp = node.next;
        node.next = temp.next;
        return temp.data;
    }
    
    public Node<E> getMiddle() {
        
        if (head == null && head.next == null )
            return head;
        
        Node<E> slow = head, fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
        
    }
    
    public void moveToFront() {
        Node<E> slow, fast;
        slow = null;
        fast = head;
        
        while (fast.next != null) {
            slow = fast;
            fast = fast.next;
        }
        slow.next = null;
        fast.next = head;
        head = fast;
    }
    
    public Node sort(Node n){
        if(n == null || n.next ==null )
            return n;
        
        Node middle = getMiddle(n);
       Node nextOfMiddle =middle.next;
       middle.next = null;
       Node left = sort(n);
       Node right = sort(nextOfMiddle);
       Node result = mergeSort(left, right);
       
      return result;
    }
    
    private Node mergeSort(Node left, Node right) {
        
        if(left==null)return right;
        if(right ==null)return left;
        
        Node result = null;
        
        if((int)left.data <= (int)right.data){
                result = left;
                result.next = mergeSort(left.next, right);
        }
        else {
            result = right;
            result.next = mergeSort(left, right.next);
        }
        return result;
    }
    
    //
    private Node getMiddle(Node n){

        if (n== null || n.next == null)
            return n;
        Node fast= n, slow =n;

        while (fast.next!=null && fast.next.next !=null){
            fast= fast.next.next;
            slow= slow.next;
        }
        return slow;
    }
    
    
    
    
}
