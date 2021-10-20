package Q1;

class Table{
    synchronized void print(int n){
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
class MT1 extends Thread{
    Table t;
    MT1(Table t){
        this.t=t;
    }
    public void run(){
        t.print(7);
    }
}
class MT2 extends Thread{
    Table t;
    MT2(Table t){
        this.t=t;
    }
    public void run(){
        t.print(20);
    }
}
public class Smethod{
    public static void main(String[] args) {
        Table k=new Table();
        MT1 t1=new MT1(k);
        MT2 t2=new MT2(k);
        t1.start();
        t2.start();
    }
}
    
