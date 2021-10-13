package Q4;

import java.util.logging.Handler;

class MyThread1 extends Thread{
    MyThread1(String name){
        super(name);
    }
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("This is daemon thread.");
            return;
        }
        System.out.println("Hello this is thread: "+ this.getName());
        System.out.println("Thread "+this.getName()+ " will now sleep:");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread "+this.getName()+" is ended.");
    }
}

public class q4 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("thread1");
        MyThread1 t2 = new MyThread1("thread2");
        MyThread1 t3 = new MyThread1("thread3");
        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();
        long start = System.currentTimeMillis();
        long end = start + 2*1000;
        while (System.currentTimeMillis() < end) {
            // Some expensive operation on the item.
        }
        System.out.println("current state of daemon thread is: "+t1.getState());
    }
}
