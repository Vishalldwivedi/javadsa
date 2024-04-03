import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class largestSubarraywith01 extends Solution {

    //for SEARCHING - >  array if sorted logn(binary search ) if unsorted (n) linear search
    // linkedlist -> On time
    // binary tree = n time
    // bst = n time theta  is logn
    // b b s t = logn
    // priority queue -> n time
    // stack = n time worst case
    // queue = n time worst case

    //HASHING O(1) time to search

    // to prevent or make less collision  we need better hashfunctions.
    // chaining . // deletion and searching On time it can take
    // load factor = total no of elements / size of the hasharray
    // load factor = at a given box how many elem it can store // lesser load factor is better


    //CN:
    // message is corrupted btw the sender and the receiver ;// some extra bits r added
    // how to confirm  there is no chadkhani in my mssg here hash code is used
    //  hash code has a property if can not is reversed
    // eg: from data set we take 263 and apply hashfunction %10--> generate index 3
    // now by 3 we can not generate back 263
    // eg: sha 256(2^256 length supported means can represent in 256 bits)
    // , sha 512 // hash function used in blockchain hashcode 1's in trillion time collision can happen
    // little change in original massage can make whole hashcode different this is called avalanche effect

    // eg: data base leak : name , phone no , id can leaked
    // but password can not be leaked why?
    // because instead of original password hashcode is stored
    // so our hash function should generate hashcode  which r less colloid
    //
        public static  int findMaxLength(int[] nums) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            int sum = 0;
            int len = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1) {
                    sum++;
                } else {
                    sum--;
                }
                if (sum == 0) {
                    len = i + 1;
                }
                if (hm.containsKey(sum)) {
                    len = Math.max(len, i - hm.get(sum));
                } else {
                    hm.put(sum, i);
                }
            }
            return len;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();

            // Example input
            int[] nums = {0, 0, 1, 0, 1, 1, 1};
            int maxLength = solution.findMaxLength(nums);
            System.out.println("Maximum length of contiguous subarray with equal number of 0s and 1s: " + maxLength);

            // Additional test cases
            int[] nums2 = {0, 1, 0, 1, 0, 1};
            int maxLength2 = solution.findMaxLength(nums2);
            System.out.println("Maximum length of contiguous subarray with equal number of 0s and 1s: " + maxLength2);

            int[] nums3 = {1, 1, 1, 0, 1, 1, 0, 0, 1};
            int maxLength3 = solution.findMaxLength(nums3);
            System.out.println("Maximum length of contiguous subarray with equal number of 0s and 1s: " + maxLength3);
        }
    }

