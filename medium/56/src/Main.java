import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        //int[] nums = {9, 1, 7, 9, 7, 9, 7};
        int[] nums = {9, 4, 9, 9};
        System.out.println(solution.singleNumber(nums));
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int e : nums)
        {
            int count = result.getOrDefault(e, 0) + 1;
            result.put(e, count);
        }
        for (Map.Entry<Integer, Integer> entry : result.entrySet())
        {
            if (entry.getValue() == 1)
            {
                return entry.getKey();
            }
        }
        return 0;
    }
}
