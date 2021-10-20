class Thrd1{}
class Thrd2{}
class Thrd3{}
class Thrd4{}

public class Q3 {
    public static void main(String[] args) {
       Thrd1 T1 = new Thrd1();
       Thrd2 T2  = new Thrd2();
       Thrd3 T3 = new Thrd3();
       Thrd4 T4  = new Thrd4();
        new Thread() {
            public void run() {
                synchronized(T1) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Locked T1 , waiting for T2 to get unlocked");
                    synchronized(T2) {

                    }
                }
            }
        }.start();
        new Thread() {
            public void run() {
                synchronized(T2) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Locked T2 , waiting for T3 to get unlocked");
                    synchronized(T3) {
                        
                    }
                }
            }
        }.start();
        new Thread() {
            public void run() {
                synchronized(T3) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Locked T3 , waiting for T4 to get unlocked");
                    synchronized(T4) {
                        
                    }
                }
            }
        }.start();
        new Thread() {
            public void run() {
                synchronized(T4) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Locked T4 , waiting for T1 to get unlocked");
                    synchronized(T1) {
                        
                    }
                }
            }
        }.start();
    }
}
