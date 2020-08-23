import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        int[] nums = {1, 3, 4, 2, 2};
        Solution solution = new Solution();
        System.out.println(solution.findDuplicate(nums));
    }
}
class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : nums)
        {
            int count = map.getOrDefault(e, 0) + 1;
            map.put(e, count);
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if (entry.getValue() != 1) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }
}
