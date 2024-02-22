import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class gen<T>{
    T obj;
    public gen(T obj){
        this.obj = obj;
    }
    public  T getObj(){
        return obj;
    }
    void display(){
        System.out.println("type of data  is " + obj.getClass().getName());
    }

}
public class gen3 {
    public static void main(String[] args) {
//        ArrayList<String> l = new ArrayList<String>();
//        List<String> l2 = new ArrayList<String>();
//        Collection<Integer> l3 = new ArrayList<Integer>();
//        Collection<Integer> l3 = new ArrayList<Integer>();

        gen<Integer> g = new gen<Integer>(6);
        g.display();
        g.getObj();

        System.out.println("+++++++++++++++++++++++++++");
        gen<String> g1 = new gen<String>("vishal");
        System.out.println(g1.getObj());
        g1.display();



    }
}
