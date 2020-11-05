package DSA.LinkedList.Queue;

/**
 * Created by Vishnu.jangid on 06/05/2020 AD .
 */

public class Runner {
    public static void main(String[] args) {
          QueueBy2Stack q = new QueueBy2Stack();
          q.eQueue(2);
          q.eQueue(10);
          System.out.println(q.dQueue());
        q.eQueue(15);
        System.out.println(q.dQueue());
        System.out.println(q.dQueue());
        System.out.println(q.dQueue());
        System.out.println(q.dQueue());
    }
}
