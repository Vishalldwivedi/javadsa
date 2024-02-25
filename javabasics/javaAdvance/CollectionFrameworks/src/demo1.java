import java.util.Arrays;

class Solution {

        public int longestConsecutive(int[] nums) {
            if(nums.length == 0 || nums == null){
                return 0;
            }
            Arrays.sort(nums);
            int longest = 1;
            int curr = 1;
            int prev = nums[0];

            for(int i = 0 ;i<nums.length;i++){
                if(nums[i] == prev+1 ){
                    curr++;
                }else if(nums[i] != prev ){
                    curr = 1;
                }

                prev = nums[i];
                longest = Math.max(longest,curr);
            }
            return longest;
        }


    public int[] productExceptSelf(int[] nums) {
        int pro = 1;
        int zeros = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
                continue;
            }
            pro *= nums[i];
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (zeros == 1 && ans[i] == 0) {
                ans[i] = pro;
            } else if (zeros == 1 && ans[i] != 0) {
                ans[i] = 0;
            } else if (zeros > 1) {
                ans[i] = 0;
            } else {
                ans[i] = pro / nums[i];
            }
        }
        return ans;
    }
}
public class demo1 {
    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};

        Solution s = new Solution();
//        int[] ans = s.productExceptSelf(arr);
//        for(int i : ans){
//            System.out.println(i);
//        }
        int[] aa  = {100,4,200,1,3,2};
        int a = s.longestConsecutive(aa);
        System.out.println(a);
    }
}
