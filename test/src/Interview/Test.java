package Interview;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        LinkListMy ll =new LinkListMy();
        ll.insert("vishnu");
        ll.insert("pratham");
        ll.insert("vikash");
        ll.print();
        System.out.println("*************");
        Node n = ll.reverse();
        ll.print(n);
    }
}
class Node{
    String data;
    Node next;
}
class LinkListMy {
   private Node head;

    public void insert(String s){

        Node node = new Node();
        node.data = s;
        node.next = null;

        if(this.head==null){
            this.head = node;
        }else {
            Node n = this.head;
            while (n.next!=null){
                n = n.next;
            }
            n.next = node;

        }

    }
    public void print(){
        Node n = this.head;
        while (n.next!=null){
            System.out.println(n.data);
            n= n.next;
        }
        System.out.println(n.data);

    }
    public void print(Node node ){
        Node n = node;
        while (n.next!=null){
            System.out.println(n.data);
            n= n.next;
        }
        System.out.println(n.data);

    }
  public void removeLast(){
      Node n = this.head;
      while (n.next.next!=null){
          System.out.println(n.data);
          n= n.next;
      }
      n.next = null;

  }

  public Node reverse(){
    Node current = head;
    Node prv =null, next = null;

    while(current!=null){
        next = current.next;
        current.next = prv;
        prv = current;
        current = next;
    }
    return prv;
  }







}