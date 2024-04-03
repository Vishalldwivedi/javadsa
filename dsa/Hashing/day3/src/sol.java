import java.util.LinkedList;

public class sol {

        public static  int numberOfSubarrays(int[] nums, int k) {
            LinkedList<Integer> deq = new LinkedList();
            deq.add(-1);
            int res = 0;
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] % 2 == 1)
                    deq.add(i);
                if (deq.size() > k + 1)
                    deq.pop();
                if (deq.size() == k + 1)
                    res += deq.get(1) - deq.get(0);
            }
            return res;
        }

    public static void main(String[] args) {
        int[] arr=  {2,2,2,1,2,2,1,2,2,2};
        int k =  2;

        int ans = numberOfSubarrays(arr, 2);
        System.out.println(ans);

    }
    }
