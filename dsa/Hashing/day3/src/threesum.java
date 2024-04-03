import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesum {
    public static List<List<Integer>> threesumm(int nums[]) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            int x = nums[i];

            while (l < r) {
                if (x + nums[l] + nums[r] == 0) {
                    list.add(Arrays.asList(x, nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }

                    l++;
                    r--;
                } else if (x + nums[l] + nums[r] > 0) r--;
                else l++;
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int n[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lis = threesumm(n);
        for (List<Integer> as : lis) {
            System.out.println(as);
        }
    }
}

