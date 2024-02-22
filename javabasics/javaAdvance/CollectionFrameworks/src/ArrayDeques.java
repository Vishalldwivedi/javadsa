import java.util.ArrayDeque;

public class ArrayDeques {
    public static void main(String[] args) {
        //arraydeque class implements dequeue interface
        // dequeue interface extends queue interface
        // index based accessing is not allowed here
        //arraydeque internally follow double ended queue
        //fifo - > queue
        //deque from front and rear end insert or delete
        // can have duplicate
        // no size restruction and it is faster
        //random access is not possible
        // cant add data in middle only front or rear
        ArrayDeque ad = new ArrayDeque();

        ad.add(33);
        ad.addFirst(44);;
        ad.addLast(55);
        ad.add(3);
        ad.add(4);
        ad.add("vishal");
        System.out.println(ad);// front[44, 33, 55, 3, 4]rear

        ad.offer(1);//offer can be rejected but add will not rejected
        ad.offerFirst(99);
        ad.offerLast(100);
        System.out.println(ad);
    }
}
