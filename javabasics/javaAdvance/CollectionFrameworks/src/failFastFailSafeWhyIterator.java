import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class failFastFailSafeWhyIterator {
    public static void main(String[] args) {
        ArrayList ls = new ArrayList();
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.add(6);
        System.out.println(ls);

//        for (int i = 0; i < ls.size(); i++) {
//            System.out.println(ls.get(i));
//            ls.add(7);// so infinite time your loop well execute size will keep on increasing
//            // dont use loops when using collections
//        }

//        Iterator it = ls.iterator();
//        while(it.hasNext()){
//           // Integer itt= (Integer)it.next();
//           // ls.add(44);//ConcurrentModificationException //fail fast
//            System.out.println(it.next());
//        }

        // failsafe exception not to come and also data not to be added
        CopyOnWriteArrayList lss = new CopyOnWriteArrayList();
        lss.add(36);
        lss.add(46);
        lss.add(56);
        lss.add(66);
        System.out.println(lss);
        Iterator i = lss.iterator();

        while(i.hasNext()){
            lss.add(443);
            System.out.println(i.next());
        }

    }
}
