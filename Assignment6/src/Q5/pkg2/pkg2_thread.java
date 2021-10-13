package Q5.pkg2;

public class pkg2_thread extends Thread{
    public pkg2_thread(ThreadGroup tg1, String name){
        super(tg1,name);
    }

    @Override
    public void run() {
        System.out.println("This is thread t2 in package pkg2");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}