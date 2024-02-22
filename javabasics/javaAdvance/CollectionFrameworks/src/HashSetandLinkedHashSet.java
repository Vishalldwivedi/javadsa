import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetandLinkedHashSet {
    public static void main(String[] args) {
        ///hashset directly implements set interface;
        // linkedhashset extends hashset class;ie linkedhashset is a sub class of hashset class
        //hashset was introduced in 1.2 version and linkedhasset was introduces in java 1.4
        // it stores unique elements in random order
        // it uses hashfunciotn for no collision
        // if 75 percnet of data is filled than automitically it will double
        HashSet hs = new HashSet();
        hs.add(44);
        hs.add(39);
        hs.add(29);
        hs.add(20);
        hs.add(20);
        System.out.println(hs);
        LinkedHashSet lh = new LinkedHashSet(); // order is maintained
        lh.add(44);
        lh.add(39);
        lh.add(29);
        lh.add(20);
        lh.add(20);
        System.out.println(lh);


    }
}
