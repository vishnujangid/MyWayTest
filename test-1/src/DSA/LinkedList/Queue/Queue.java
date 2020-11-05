package DSA.LinkedList.Queue;

import DSA.LinkedList.LinkedList.LinkedList;
import DSA.LinkedList.LinkedList.Node;

/**
 * Created by Vishnu.jangid on 06/05/2020 AD .
 */

public class Queue<E> {
    LinkedList<E> linkedList;
    
    public Queue() {
    }
    
    public void add(E item){
    if(linkedList==null){
        LinkedList<E> list = new LinkedList<>();
        list.insert(item);
        linkedList = list;
        return;
    }
    linkedList.insert(item);
    }
    public void remove(){
        linkedList.deleteAt(0);
    }
    
    public E getFront(){
       return linkedList.getFirst().getData();
    }
    
    public E getRear(){
        if(linkedList.getFirst()==null)return linkedList.getFirst().getData();
        Node<E> node = linkedList.getFirst();
        while (node.getNext()!=null){
            node=node.getNext();
        }
        return node.getData();
    }
    
    public void display(){
        Node eNode = linkedList.getFirst();
        System.out.println("Queue Display ");
        while (eNode!=null){
            System.out.print(eNode.getData()+" ");
            eNode= eNode.getNext();
        }
    }
}
