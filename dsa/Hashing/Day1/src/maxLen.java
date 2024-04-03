import java.util.HashMap;

public class maxLen{
    public static int maxLen(int arr[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int sum = 0;
        int len = 0; // Initialize length of subarray to 0
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                len = i + 1; // Update length if entire subarray sums to 0
            } else if (hm.containsKey(sum)) {
                len = Math.max(len, i - hm.get(sum)); // Update length if subarray with sum 'sum' found
            } else { // Store sum if not present in map
                hm.put(sum, i);
            }
        }
        return len;
    }

    public static void main(String[] args) {


        // Example input
        int[] arr = {0, 0, 1, 0, 1, 1, 1};
        int maxLength = maxLen(arr, arr.length);
        System.out.println("Maximum length of contiguous subarray with equal number of 0s and 1s: " + maxLength);

        // Additional test cases
        int[] arr2 = {0, 1, 0, 1, 0, 1};
        int maxLength2 = maxLen(arr2, arr2.length);
        System.out.println("Maximum length of contiguous subarray with equal number of 0s and 1s: " + maxLength2);

        int[] arr3 = {1, 1, 1, 0, 1, 1, 0, 0, 1};
        int maxLength3 = maxLen(arr3, arr3.length);
        System.out.println("Maximum length of contiguous subarray with equal number of 0s and 1s: " + maxLength3);
    }
}
