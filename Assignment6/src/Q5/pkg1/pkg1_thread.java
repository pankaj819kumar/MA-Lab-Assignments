package Q5.pkg1;

public class pkg1_thread extends Thread{
    public pkg1_thread(ThreadGroup tg1, String name){
        super(tg1,name);
    }

    @Override
    public void run() {
        System.out.println("This is thread t1 in package pkg1");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
