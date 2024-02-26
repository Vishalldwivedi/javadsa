import java.util.PriorityQueue;

public class priorityqueues {
    public static void main(String[] args) {

        // priorityqueue implemets queue interface
        // indexbased acces is not allowed
        // order is not maintained
        // internially it stored data as min heap like binary tree; cbt;
        //different type of data not allowed and null type
        // duplicate r allowed
        PriorityQueue p = new PriorityQueue();
        p.add(50);
        p.add(33);
        p.add(4);
        p.add(44);
        p.add(44);
        p.add(125);
        p.add(271);
        p.add(178);
        System.out.println(p);


        System.out.println(p.peek());
        System.out.println(p.poll());
        System.out.println();
    }
}
