import java.util.HashMap;

public class firstRepeating {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int ind = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(hm.containsKey(arr[i])) {
                ind = Math.min(ind, hm.get(arr[i]));
            } else {
                hm.put(arr[i], i);
            }
        }
        return ind == Integer.MAX_VALUE ? -1 : ind + 1; // Adjust for 1-based indexing
    }

    // Main method to demonstrate the usage of firstRepeated method
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 4, 3, 5, 6};
        int n1 = arr1.length;
        System.out.println("Output for arr1: " + firstRepeated(arr1, n1)); // Output: 2

        int[] arr2 = {1, 2, 3, 4};
        int n2 = arr2.length;
        System.out.println("Output for arr2: " + firstRepeated(arr2, n2)); // Output: -1
    }
}
