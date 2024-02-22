import java.util.ArrayList;
import java.util.Collections;

public class cc {
    public static void main(String[] args) {
        //set queue list all r extending collection interface
        // collections class is different than collection interface

        ArrayList ls = new ArrayList();
        ls.add(100);
        ls.add(10);
        ls.add(103);
        ls.add(1230);
        ls.add(10331);
        ls.add(1);
        System.out.println(ls);
        // if u want to do operations like sort u can use collection class static methods
        Collections.sort(ls);
        System.out.println(ls);


        ArrayList<String> l = new ArrayList<String>();
        l.add("df");
        l.add("ad");
        l.add("mb");
        l.add("zz");
        l.add("fdisf");
        l.add("dsfsd");
        Collections.sort(l);
        System.out.println(l);

        int index = Collections.binarySearch(ls,1230);
        System.out.println(index);
Collections.rotate(ls,4);
        System.out.println(ls);
        int ans = Collections.frequency(ls,1);
        System.out.println(ans);

    }
}
