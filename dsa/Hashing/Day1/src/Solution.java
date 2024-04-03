import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class  Solution{
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
        }
