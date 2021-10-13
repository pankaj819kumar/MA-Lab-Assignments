package Q3;

class MyThread1 implements Runnable{
    public void run() {
        System.out.println("Hello:) this is thread sania");
        System.out.println("Thread sania will now sleep for 1 minute:");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread sania is now stopped.");
    }
}
class MyThread2 implements Runnable{
    public void run() {
        System.out.println("Hello:) this is thread maria");
        System.out.println("Thread maria will now sleep for 2 minutes:");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread maria is now stopped.");
    }
}
class MyThread3 implements Runnable{
    public void run() {
        System.out.println("Hello:) this is thread serena");
        System.out.println("Thread serena will now sleep for 500 sec:");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread serena is now stopped.");
    }
}

public class q3 {
    public static void main(String[] args) {
        MyThread1 r1 = new MyThread1();
        MyThread2 r2 = new MyThread2();
        MyThread3 r3 = new MyThread3();

        Thread t1 = new Thread(r1,"sania");
        Thread t2 = new Thread(r2,"maria");
        Thread t3 = new Thread(r3,"serena");

        t1.setPriority(6);
        t2.setPriority(6);
        t3.setPriority(6);

        t1.run();
        t2.run();
        t3.run();
        System.out.println("As you can see, by calling run it don't create new Thread but just executes run method, and they are executing one after another.");
        System.out.println("");
        t1.start();
        t2.start();
        t3.start();

        System.out.println("As you can see after call .start method, Threads are created and they are running concurrently.");
    }
}
