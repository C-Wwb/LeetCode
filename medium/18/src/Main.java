import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(solution.fourSum(nums, target));
    }
}
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        for (int i = 0; i < 100000000; i++)
        {
            List<Integer> temp = new ArrayList<>();
            int a = (int)(Math.random() * (nums.length));
            int b = (int)(Math.random() * (nums.length));
            int c = (int)(Math.random() * (nums.length));
            int d = (int)(Math.random() * (nums.length));
            if (a != b && a != c && a != d && b != c && b != d && c != d
                    && nums[a] + nums[b] + nums[c] + nums[d] == target)
            {
                if (!sum.contains(a + b + c + d))
                {
                    sum.add(a + b + c + d);
                }
                else
                {
                    continue;
                }
                temp.add(nums[a]);
                temp.add(nums[b]);
                temp.add(nums[c]);
                temp.add(nums[d]);
                if (!result.contains(temp))
                {
                    result.add(temp);
                }
            }
        }
        return result;
    }
}