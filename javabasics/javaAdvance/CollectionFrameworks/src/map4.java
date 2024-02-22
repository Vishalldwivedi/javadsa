import java.util.Hashtable;
import java.util.TreeMap;

public class map4 {
    public static void main(String[] args) {
        //order of insertion is not preserved
        // thread safe hashtable in syncronized envvironment at a time only one thread works
        Hashtable ht = new Hashtable();// after 75 is filled dynamically doubles
        ht.put(1,"rohit");
        ht.put(2,"vishal");
        ht.put(3,"vikas");
        System.out.println(ht);
        ht.putIfAbsent(3,"vikas");


        TreeMap tm = new TreeMap();// ascending sorted order;
        // we can give the reference of any object at a key in maps
        tm.put(2,"rohitsharma");
        tm.put(1,"ramish");
        tm.put(4,"rahul");
        tm.put(3,"vishal");
        System.out.println(tm);
    }
}
