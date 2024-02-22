import java.util.*;

public class map1 {
    public static void main(String[] args) {
        // map is a interface
        // here each key value pair is entry;

        // map interface is implemented by two calsses
        // 1. hashtable
        //2.hashmap -> subclass linkedhashmap extends hashmap ;
        //
        // hashmap will not assure the order of access
        //in hashmap null as a key and value is allowed
        // behind the seen it follows hashing algo or table
        //hashtable dont allow null key and values and
        //hashmap and hashtable r thread safe ie using synchronized keyword void race condition.
        // at a time single thread is using a resou
        HashMap hm = new HashMap();
//        HashMap hm2 = new LinkedHashMap();
//        Hashtable hm3 = new Hashtable();
//        TreeMap hm4 = new TreeMap();
        hm.put(null , null);
        hm.put(01,"vishal");// comninaiotn of key value is entry so there r 5 entryies
        hm.put(02,"dwiveid");
        hm.put(03,"rohit");
        hm.put(04,"vishal");
        System.out.println(hm);


        // to maintain my order or insertion while accessing i will then use linkedhashmap 1.4 version subclass of hm

        LinkedHashMap h = new LinkedHashMap();
        h.put(1,"vishal");
        h.put(5,"dis");
        h.put(8,"sd");
        h.put(2,"vika");
        System.out.println(h);
    }
}
