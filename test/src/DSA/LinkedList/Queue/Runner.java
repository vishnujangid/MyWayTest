package DSA.LinkedList.Queue;

/**
 * Created by Vishnu.jangid on 06/05/2020 AD .
 */

public class Runner {
    public static void main(String[] args) {
            Queue<Integer> q = new Queue<>();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.display();
        System.out.println(q.getFront());
        System.out.println(q.getRear());
    }
}
