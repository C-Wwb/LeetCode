public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = {1, -2, -3};
        System.out.println(solution.minStartValue(nums));
    }
}
class Solution {
    public int minStartValue(int[] nums) {
        int standard = 1;
        while (standard > 0)
        {
            int sum = standard;
            for (int i = 0; i < nums.length; i++)
            {
                sum += nums[i];
                if (sum < 1)
                {
                    break;
                }
                if (i == nums.length - 1)
                {
                    return standard;
                }
            }
            standard++;
        }
        return 0;
    }
}