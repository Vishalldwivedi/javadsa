import java.security.KeyStore;
import java.util.*;

public class map2 {
    public static void main(String[] args) {
        Map m= new HashMap();// hashmap parent is map as it is directly implementing map interface;
        //so we can make the reference as parent type
        m.put(1,"vishal");// store key and values as a object behind the seen // ENRTY
        m.put(2,"dwivedi");
        m.put(3,"rahul");
        m.put(4,"krsh");
        System.out.println(m);
        m.get(4);

        // for accessing the key value map.iterator is not there so there r three main method for that
        Set key =m.keySet();// iterate over the keys
        Iterator itr = key.iterator();
        while(itr.hasNext()){
            //Integer gh=(Integer)itr.next();
            System.out.println(itr.next());
        }

        Collection c  = m.values();//collection is a parent of all in collection herichy
        Iterator it= c.iterator();
        while(it.hasNext()){
            String st = (String)it.next();
            System.out.println(it.next());
        }

        // to access all the key value pair// all entry
       Set st =  m.entrySet();// entry interface is under map so to access entry we do map.entry
        Iterator dd = st.iterator();
        while(dd.hasNext()){
           Map.Entry jj = (Map.Entry)dd.next();
            System.out.println(jj.getKey() + " " +  jj.getValue());
        }
    }
}
