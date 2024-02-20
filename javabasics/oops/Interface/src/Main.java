


interface A{
    int num   = 6  ;// by default public static and final
    void show();// by default public and abstract(can describe) methods in interface
}
interface B{
    void abc() ;
}
class C implements A , B{
    public void show(){
        System.out.println("in show");
    }
    public void abc(){
        System.out.println("in abc");
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println(A.num);// as num is static there for we can use it by the name of interface
    }
}