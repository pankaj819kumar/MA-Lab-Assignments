package Q1;

class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println("State after calling sleep method on "+this.getName()+" is: "+ this.getState());
    }
}

public class q1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("sachin");
        MyThread t2 = new MyThread("virat");
        MyThread t3 = new MyThread("sehwag");
        System.out.println("Before start The state of Thread t1 is: "+ t1.getState());
        t1.start();
        System.out.println("After start The state of Thread t1 is: "+ t1.getState());
        t2.start();
        System.out.println("After start The state of Thread t2 is: "+ t2.getState());
        t3.start();
        System.out.println("After Sleep "+ t1.getName()+" is: "+t1.getState());
        System.out.println("After Sleep "+ t2.getName()+" is: "+t2.getState());
        System.out.println("After Sleep "+ t3.getName()+" is: "+t3.getState());
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State of t2 is: "+ t2.getState());
        System.out.println("State of t1 is: "+ t1.getState());
        System.out.println("State of t3 is: "+ t3.getState());
    }
}
