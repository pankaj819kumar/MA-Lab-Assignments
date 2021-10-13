package Q5;

import Q5.pkg1.pkg1_thread;
import Q5.pkg2.pkg2_thread;
import Q5.pkg3.pkg3_thread;

public class Main {
    public static void main(String[] args) {
        ThreadGroup tg1 = new ThreadGroup("Group1");
        pkg1_thread t1 = new pkg1_thread(tg1,"thread1");
        pkg2_thread t2 = new pkg2_thread(tg1,"thread2");
        pkg3_thread t3 = new pkg3_thread(tg1,"thread3");
        t1.start();
        t2.start();
        t3.start();

        try {
            t1.checkAccess(); //1
            System.out.println("You have access to modify thread group.");
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Active threads in thread group: "+tg1.activeCount()); //2
        System.out.println("Active thread groups in thread group: "+tg1.activeGroupCount()); //3
        Thread[] group_threads = new Thread[tg1.activeCount()];
        tg1.enumerate(group_threads);  //4
        for (Thread th: group_threads){
            System.out.println("this is active thread: "+ th.getName());
        }
        System.out.println("Name of the thread group is: "+ tg1.getName()); //5
        System.out.println("MaxPriority of the thread group is: "+ tg1.getMaxPriority()); //6
        System.out.println("String of the thread group tg1 is: "+ tg1.toString()); //7

        tg1.suspend();
        System.out.println(tg1.activeCount());
        tg1.resume();
    }
}
