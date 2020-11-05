package Java.Availity;

import DSA.LinkedList.LinkedList.Node;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

class LinkList{

    Node head;
    class Node {
        int data;
        Node next;

        public Node(int data, Node next){
            this.data = data;
            this.next= next;
        }
    }
    public void append(int value) {
        if (head == null) {
            this.head = new Node(value, null);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node temp1 = new Node(value, null);
            temp.next = temp1;

        }

    }


    public void remove(int index){
        for(int i = 0 ;head.next!=null;i++){
            if(index==0){
                head=head.next;
            }
            if(i+1==index){
                if(head.next.next!=null)
                    head.next= head.next.next;
            }
            head = head.next;
        }
    }
    public void print(){
        Node temp = head;

        while(temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);

    }

}
public class SecondRound {

    public int SecondRound(){
        return 0;
    }

    public static void main(String[] args) {
        // 1->2 , Append(3), 1->2->3
        // 1->2->3, RemoveAt(1), 1->3
        //Print()
        LinkList ll = new LinkList();
       ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.print();
        SecondRound s = new SecondRound();
        s.SecondRound();

    }
}
