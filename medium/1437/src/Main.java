public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = {0,1,0,1};
        int k = 1;
        System.out.println(solution.kLengthApart(nums, k));
    }
}
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 1 && i != 0)
            {
                if (count < k)
                {
                    return false;
                }
                count = 0;
            }
            else if (nums[i] == 0)
            {
                count++;
            }
        }
        return true;
    }
}