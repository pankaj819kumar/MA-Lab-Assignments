package Q2;

class MyThread1 extends Thread{
    MyThread1(String name){
        super(name);
    }
    public void run() {
        System.out.println("Hello this is thread: "+ this.getName());
        System.out.println("Thread "+this.getName()+ " will now sleep:");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class MyThread2 extends Thread{
    MyThread2(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Hello this is thread: "+ this.getName());
        System.out.println("Thread "+this.getName()+ " will now sleep:");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class MyThread3 extends Thread{
    MyThread3(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Hello this is thread: "+ this.getName());
        System.out.println("Thread "+this.getName()+ " will now sleep:");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Calling yield on "+ this.getName()+" this will now stop:");
        Thread.yield();
    }
}

public class q2 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("sania");
        MyThread2 t2 = new MyThread2("maria");
        MyThread3 t3 = new MyThread3("serena");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Now the thread t1 will run:");
        t1.run();
        System.out.println("Now threads t1, t2, t3 will start:");
        t1.start();
        t2.start();
        t3.start();

        System.out.println("The priority of thread t1 is :"+ t1.getPriority());
        System.out.println("The priority of thread t2 is :"+ t2.getPriority());
        System.out.println("The priority of thread t3 is :"+ t3.getPriority());

        System.out.println("Thread t3 now will be suspended.");
        t3.suspend();
        System.out.println("Thread t3 now will be resumed.");
        t3.resume();

        try {
            System.out.println("Calling join method on thread t1. ");
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
