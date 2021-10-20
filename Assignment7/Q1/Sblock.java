package Q1;

class Table2{
    synchronized void print(int n){
        synchronized(this){
            for(int i=1;i<=5;i++){
                System.out.print(i+n+" ");
                try{
                    Thread.sleep(400);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
            System.out.println(); 
        }
    }
}
class MTT1 extends Thread{
    Table2 t;
    MTT1(Table2 t){
        this.t=t;
    }
    public void run(){
        t.print(7);
    }
}
class MTT2 extends Thread{
    Table2 t;
    MTT2(Table2 t){
        this.t=t;
    }
    public void run(){
        t.print(20);
    }
}
public class Sblock {
    public static void main(String[] args) {
        Table2 k=new Table2();
        MTT1 t1=new MTT1(k);
        MTT2 t2=new MTT2(k);
        t1.start();
        t2.start();
    }
}

    
