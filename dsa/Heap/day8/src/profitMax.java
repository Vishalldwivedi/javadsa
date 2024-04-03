import java.util.Collections;
import java.util.PriorityQueue;

public class profitMax {
    public static void main(String[] args) {
        // Example inputs
        int[] A1 = {2, 3};
        int B1 = 3;
        int[] A2 = {1, 4};
        int B2 = 2;

        // Example outputs
        System.out.println(solve(A1, B1)); // Output: 7
        System.out.println(solve(A2, B2)); // Output: 7
    }

    public static int solve(int[] A, int B) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Add non-zero elements of A to priority queue
        for (int i : A) {
            if (i != 0) {
                pq.add(i);
            }
        }

        int profit = 0;

        // Sell tickets until B becomes 0 or priority queue becomes empty
        while (B > 0 && !pq.isEmpty()) {
            int seats = pq.poll(); // Get the row with maximum seats
            profit += seats; // Add the profit from selling tickets in this row
            pq.offer(seats - 1); // Reduce one seat in this row and add back to the priority queue
            B--; // Sold one ticket
        }

        return profit;
    }}