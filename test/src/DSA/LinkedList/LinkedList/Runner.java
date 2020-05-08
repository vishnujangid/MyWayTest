package DSA.LinkedList.LinkedList;


/**
 * Created by Vishnu.jangid on 29/04/2020 AD .
 */


public class Runner {
    public static void main(String[] args) {
        
//       DListCall();
//       ListCall();
       CircularLL();
        
    }
    
    private static void CircularLL() {
        CircularLinkedList l = new CircularLinkedList();
        l.add(10);
        l.add(16);
        l.add(8);
        l.add(6);
        l.add(13);
        l.show();
        System.out.println(isCircular(l.last));
        
    }
    
    private static boolean isCircular(Node head) {
        if (head == null)
            return true;
        Node node = head.next;
        while (node != null && node != head) {
            node = node.next;
        }
        return node == head;
    }
    
    private static void evenOfSumAndProduct(Node n) {
        
        Node head = n;
        int sum = 0;
        int product = 1;
        
        while (head != null) {
            int x = (Runner.digitSum((int)head.data));
            if (x % 2 == 0) {
                sum += (int) head.data;
                product *= (int) head.data;
            }
            head=head.next;
            
        }
        System.out.println("sum " + sum);
        System.out.println("Product  " + product);
        
    }
    
    private static int digitSum(int data) {
        int sum = 0;
        while (data > 0) {
            sum += data % 10;
            data /= 10;
        }
        return sum;
    }
    
    
    private static void ListCall() {
        LinkedList<Integer> l = new LinkedList();
//        l.insert(1);
//        l.insert(5);
//        l.insert(2);
//        l.insert(4);
//        l.insert(3);
//        l.show();
    
        l.insert(15);
        l.insert(16);
        l.insert(8);
        l.insert(6);
        l.insert(13);
        Runner.isCircular(l.head);
        l.show();
       // evenOfSumAndProduct(l.head);
        
    }
    
    private static void DListCall() {
        DoublyLinkedList<Integer> l = new DoublyLinkedList<>();
    
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
    
        l.show();
        System.out.println();
        l.reversePrint(l.head);
        l.reverse();
        System.out.println();
        System.out.println("Reverse :");
        l.show();
    }
    
    
}