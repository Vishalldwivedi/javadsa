import java.util.Collections;
import java.util.PriorityQueue;

public class pq {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(3);
        minHeap.add(1);
        minHeap.add(5);
        minHeap.add(2);

        System.out.println("Min-heap (default):");
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }

        // Max-heap behavior with custom comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(3);//logn
        maxHeap.add(1);
        maxHeap.add(5);
        maxHeap.add(2);

        System.out.println("\nMax-heap (with custom comparator):");
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());//log n
        }
    }
}
// in array insert we insert from the last and jump to the top compare
// delete swap to the last element
