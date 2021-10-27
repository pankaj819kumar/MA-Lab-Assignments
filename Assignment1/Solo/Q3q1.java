package Solo;

class VolumeOfBox{
    int length;
    int breadth;
    int height;
    public int volume(){
        return length*breadth*height;
    }
    public VolumeOfBox(int len, int bred, int hei){
        length = len;
        breadth = bred;
        height = hei;
    }
}

public class Q3q1 {
    public static void main(String[] args) {
        VolumeOfBox obj1 = new VolumeOfBox(3,5,4);
        VolumeOfBox obj2 = new VolumeOfBox(4,2,6);
        VolumeOfBox obj3 = new VolumeOfBox(1,3,7);

        System.out.println("Volume of box1 = " +obj1.volume());
        System.out.println("Volume of box2 = " +obj2.volume());
        System.out.println("Volume of box3 = " +obj3.volume());
    }
}
