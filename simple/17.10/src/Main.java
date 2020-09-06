import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        //int[] nums = {1, 2, 5, 9, 5, 9, 5, 5, 5};
        //int[] nums = {1, 2};
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(solution.majorityElement(nums));
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : nums)
        {
            int count = map.getOrDefault(e, 0) + 1;
            map.put(e, count);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if (entry.getValue() > nums.length / 2)
            {
                return entry.getKey();
            }
        }
        return -1;
    }
}