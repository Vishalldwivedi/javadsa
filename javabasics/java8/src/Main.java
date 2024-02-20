
//
interface A{
    void show();
    default  void config(){// we can override these also// it is public
        System.out.println("config it ");
    }
    static void abc(){
        System.out.println("in abc");
    }
}
class b implements A{
    public void show(){
        System.out.println("in show");
    }
    public  void config(){
        System.out.println("config it !");
    }
}
public class Main {
    public static void main(String[] args) {
        A obj = new b();
        obj.config();// as we don't need to implement that method on class b
        A.abc();// as no need to create its object as static
        obj.show();
    }
}