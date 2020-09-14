import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        int[] nums = {1, 2, 3};
        Solution solution = new Solution();
        System.out.println(solution.subsets(nums));
    }
}
class Solution
{
    public List<List<Integer>> subsets(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<>();
        int length = 1 << nums.length;
        for (int i = 0; i < length; i++)
        {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < nums.length; j++)
            {
                if (((i >> j) & 1) == 1)
                {
                    temp.add(nums[j]);
                }
            }
            result.add(temp);
        }
        return result;
    }
}