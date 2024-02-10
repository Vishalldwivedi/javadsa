
class demo2{
    static void dis(){
        System.out.println("static dis");
    }
    void dis2(){
        System.out.println("non static dis2");
    }
}
public class demo {
    public static void main(String[] args) {
        demo2.dis();// without creating its object we r able to call this dis method(this is object independent
        //demo2.dis2();// this is dependent to the object  until u not create the object u can't use it
        demo2  d = new demo2();
        d.dis();// static method can be invoked with object reference also and with direct class also
        d.dis2();
    }
}
