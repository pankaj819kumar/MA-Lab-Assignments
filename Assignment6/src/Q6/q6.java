package Q6;

class MyThread1 extends Thread{
    public void run(){
        System.out.println("This is thread 1");
    }
}
class MyThread2 extends Thread{
    public void run(){
        System.out.println("This is thread 2");
    }
}
class MyThread3 extends Thread{
    public void run(){
        System.out.println("This is thread 3");
    }
}
public class q6 {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        rt.addShutdownHook(new MyThread1());
        rt.addShutdownHook(new MyThread2());
        rt.addShutdownHook(new MyThread3());
        System.out.println("main is sleeping, press ctrl+c to exit.");
        try {
            Thread.sleep(200);
        }catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println("As you can see");
        System.out.println("The shutdown hook can be used to perform cleanup resources or save state when JVM shuts down normally or abruptly");
    }
}
