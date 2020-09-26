public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4};
        System.out.println(solution.productExceptSelf(nums));
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            result[i] = addition(nums, i);
        }
        return result;
    }
    public static int addition(int[] nums, int index)
    {
        int sum = 1;
        for (int i = 0; i < nums.length; i++)
        {
            if (i != index)
            {
                sum *= nums[i];
            }
        }
        return sum;
    }
}