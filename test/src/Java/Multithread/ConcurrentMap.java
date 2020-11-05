package Java.Multithread;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentMap extends Thread{

    static  List<String> l = new ArrayList<>();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Adding form Child method");
        l.add("Vishnu");
    }

    public static void main(String[] args) throws InterruptedException {
        l.add("A");
        l.add("B");
        l.add("C");
        ConcurrentMap t = new ConcurrentMap();
        t.start();
        Iterator<String> itr =  l.iterator();
        while (itr.hasNext()){
            System.out.println("Main Thread Execute ");
            System.out.println(itr.next());
            Thread.sleep(3000);
        }

    }
}
