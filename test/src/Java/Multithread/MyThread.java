package Java.Multithread;

/**
 * Created by Vishnu.jangid on 20/04/2020 AD .
 */
class HeavyWorkRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HeavyWorkRunnable Run");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThreadRun extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThreadRun");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class MyThread {
    
    Thread t2 = new Thread(() -> {
        synchronized (this){
            for (int i = 0; i < 10; i++) {
                System.out.println("HeavyWorkRunnable Run" + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }}
    });
    Thread t1 = new Thread(() -> {
        synchronized (this){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThreadRun" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    });
    
    
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        
      
       
        try {
            System.out.println("Main Thread : " + Thread.currentThread().getName());
            myThread.t1.start();
            System.out.println("Main Thread : " + Thread.currentThread().getName());
//            t1.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
