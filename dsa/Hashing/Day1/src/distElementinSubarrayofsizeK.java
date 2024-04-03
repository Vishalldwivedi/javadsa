import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashMap;
public class distElementinSubarrayofsizeK {
        public static ArrayList<Integer> countDistinct(int A[], int n, int k) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            int dc = 0;
            ArrayList<Integer> ans = new ArrayList<>();

            for (int i = 0; i < k; i++) {
                hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);
                if (hm.get(A[i]) == 1) {
                    dc++;
                }
            }
            ans.add(dc);

            for (int i = k; i < n; i++) {
                // Exclude old element
                int oldElement = A[i - k];
                hm.put(oldElement, hm.get(oldElement) - 1);
                if (hm.get(oldElement) == 0) {
                    dc--;
                }

                // Include new element
                int newElement = A[i];
                hm.put(newElement, hm.getOrDefault(newElement, 0) + 1);
                if (hm.get(newElement) == 1) {
                    dc++;
                }

                ans.add(dc);
            }
            return ans;
        }

        public static void main(String[] args) {
            // Example input
            int[] A = {1, 2, 1, 3, 4, 2, 3};
            int k = 4;
            int n = A.length;

            ArrayList<Integer> result = countDistinct(A, n, k);
            System.out.println("Distinct count in each window of size " + k + ": " + result);

            // Additional test cases
            int[] B = {1, 2, 1, 3, 4, 2, 3, 5, 6};
            int k2 = 3;
            int n2 = B.length;

            ArrayList<Integer> result2 = countDistinct(B, n2, k2);
            System.out.println("Distinct count in each window of size " + k2 + ": " + result2);
        }
}
