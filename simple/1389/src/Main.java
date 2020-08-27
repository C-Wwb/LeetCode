import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(solution.createTargetArray(nums, index)));
    }
}
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
        {
            temp.add(index[i], nums[i]);
        }
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++)
        {
            result[i] = temp.get(i);
        }
        return result;
    }
}