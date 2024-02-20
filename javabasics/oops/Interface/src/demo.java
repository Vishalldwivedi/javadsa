
interface aa{
    void show();
}
interface bb {
    void abc();
}
class b implements  aa , bb{
    public void show(){
        System.out.println("show it ");
    }
    public void abc(){
        System.out.println("abc it ");
    }

}
public class demo {
    public static void main(String[] args) {
    // if i need to call show method that is non static then we need to create its object
        aa obj = new b();// ans animal is a interface and b is dog
        obj.show();

    }
}
