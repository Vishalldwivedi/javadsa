
class demo {
    private int a;
    private int b;
    public demo(){
        System.out.println("zero paramaterised constuctor by progrmmer ");
    }
    public demo(int a, int b) {

    this.a =a;
    this.b =b;
}
    void display(){
        System.out.println(a);
        System.out.println(b);
    }
}

public class main2 {
    public static void main(String[] args) {
        demo d = new demo();// why not showing error as u r calling constructor without making constu.
        // so this is default constructor automatically called 0parameter constuctor
        demo d2= new demo(4,4);
    }
}
