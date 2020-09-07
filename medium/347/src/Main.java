import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(Arrays.toString(solution.topKFrequent(nums, 2)));
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int e : nums)
        {
            int count = map.getOrDefault(e, 0) + 1;
            map.put(e, count);
        }
        return map.entrySet().stream().sorted((e1, e2)
                -> e2.getValue() - e1.getValue()).limit(k).mapToInt(Map.Entry::getKey).toArray();
    }
}