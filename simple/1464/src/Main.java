import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = {3, 4, 5, 2};
        System.out.println(solution.maxProduct(nums));
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}