import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class iteratorandListIterator {
    public static void main(String[] args) {
        ArrayList ls = new ArrayList();
        ls.add(4);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        System.out.println(ls);
        // but we need to access a element at time retrive it how can we do that using iterator
        // or list iterator

//        for(int i =0  ;i< ls.size();i++){// for loop
//            Object obj = ls.get(i);
//            System.out.println(obj);
//        }
//
//        // for each
//        for(Object o:ls){
//            System.out.println(o);
//        }
        // if while looping in collection if some want to do operation in btw execution of loop
        //using loops fetching the data form collection is not recommended;
        // use iterator method instead collection
        // object is a parent of all the classes
        Iterator itr =ls.iterator() ;
        while(itr.hasNext()){
           // Integer i = (Integer) itr.next();// store as integer// and downcase object to integer
            System.out.println(itr.next());// it will first see has next thenit willfetch the databy .next()
        }

        ListIterator lst  = ls.listIterator(ls.size());// start from the end ;of the list
        while(lst.hasPrevious()){
           // Integer ii = (Integer) lst.previous();
            System.out.println(lst.previous());
        }
    }
}
