import java.util.*;

public class ArrayListt {
    public static void main(String[] args) {
        // in java arraylist implemets list interface
        ArrayList ls  = new ArrayList();// arraylist can store mix size info or same type
        ls.add(44);
        ls.add(444);
        ls.add(23);// array of objects can be
        ls.add("fsd");
        ls.add(4.4f);
        System.out.println(ls);

        ArrayList l = new ArrayList();
        l.add("vishal");
        l.add("dwi3");
        l.add('d');
        l.add(43);
        l.add(1.2);

        ArrayList ll = new ArrayList();
        ll.addAll(l);
        System.out.println(ll);
        ll.add(4,"dfs");
        // order will be same ;

        System.out.println(ll.contains("vishal"));

       int index =  ll.indexOf("dfs");
        System.out.println(index);
        ll.ensureCapacity(10);
        ll.trimToSize();
        System.out.println(ll.size());

        ll.clear();
        System.out.println(ll.size());

        List<Integer> l1 = new ArrayList<>();// we can take parent list as a reference
        l1.add(100);

    }
}
