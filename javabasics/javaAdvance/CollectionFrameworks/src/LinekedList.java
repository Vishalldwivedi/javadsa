import java.util.Deque;
import java.util.LinkedList;

public class LinekedList {
    public static void main(String[] args) {
        // linked list class implements two interfaces first list and deqeue interface
        // there for it will have some extra method if deque
        //internally it will follow doubly linked list to store data
        // can store duplicate objects
        // it maintain insertion order ans is not synchonized
        //Not Synchronized: LinkedList is not inherently designed to be used in a
        // multi-threaded environment where multiple threads may read and write to the list simultaneously.
        //
        //Thread-Safety: If you have multiple threads accessing and
        // modifying a LinkedList concurrently, without additional synchronization mechanisms,
        // use this for synch : List<String> synchronizedList = Collections.synchronizedList(new LinkedList<>());
        // every node will contain data left pointer and right pointer
        // in linkedlist the manupiolation is fast as no shifting
        LinkedList ll1 = new LinkedList();
        ll1.add(44);
        ll1.add("vd");
        ll1.add(38.4);
        ll1.add('c');
        System.out.println(ll1);// order of insertion is preserved


        LinkedList l = new LinkedList();
        l.add(10);
        l.add(10);
        l.add(20);
        l.add(30);
        l.addFirst(1);;
        l.addLast("lastno");
        l.add(2,"vishaldwivedi");// here there is no shifting like arrylist has shifting
        System.out.println(l);

        System.out.println(l.peek());// first object of collection
        System.out.println(l.poll());// popout form linkedlist
        System.out.println(l);

        l.get(1);
        l.indexOf(1);
        l.lastIndexOf(10);
        l.getFirst();
        l.getLast();

        l.push(777);// at front
        l.poll();// at front
        l.pop();//at front

        System.out.println(l);

        // if u r using list reference u acn only acces list method on linked list  no deque visa versa
        Deque ll= new LinkedList();
        ll.add(l);
        System.out.println(ll);

    }
}
