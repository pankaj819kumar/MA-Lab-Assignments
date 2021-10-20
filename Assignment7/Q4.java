class datas
{
    public synchronized void print1()
    {
        try{wait(2000);}
        catch(InterruptedException e){System.out.println(e);}
        System.out.println("print1");
    }
    public synchronized void print2()
    {
        System.out.println("print2");
        notify();
    }
    public synchronized void print3()
    {
        System.out.println("print3");
        notifyAll();
    }
}
public class Q4
{
    public static void main(String[] args)
    {
        datas d=new datas();
        Thread t1=new Thread()
        {
            public void run()
            {d.print1();}
        };
        Thread t2=new Thread()
        {
            public void run()
            {d.print2();}
        };
        Thread t3=new Thread()
        {
            public void run()
            {d.print3();}
        };
        t1.start();
        t2.start();
        t3.start();
    }
}
    
