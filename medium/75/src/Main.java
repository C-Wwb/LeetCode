import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = {1, 2, 1};
        solution.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int e : nums)
        {
            int count = map.getOrDefault(e, 0) + 1;
            map.put(e, count);
        }
        if (!map.containsKey(0))
        {
            map.put(0, 0);
        }
        if (!map.containsKey(1))
        {
            map.put(1, 0);
        }
        if (!map.containsKey(2))
        {
            map.put(2, 0);
        }
        for (int i = 0; i < nums.length; i++)
        {
            if (i < map.get(0))
            {
                nums[i] = 0;
            }
            else if (i >= map.get(0) && i < map.get(0) + map.get(1))
            {
                nums[i] = 1;
            }
            else
            {
                nums[i] = 2;
            }
        }
    }
}