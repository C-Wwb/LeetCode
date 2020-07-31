public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = {8, 3, 2, 4, 5};
        System.out.println(solution.findMagicIndex(nums));
    }
}
class Solution {
    public int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == i)
            {
                return i;
            }
        }
        return -1;
    }
}