package Q5.pkg3;

public class pkg3_thread extends Thread{
    public pkg3_thread(ThreadGroup tg1, String name){
        super(tg1,name);
    }

    @Override
    public void run() {
        System.out.println("This is thread t3 in package pkg3");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}