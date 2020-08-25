import java.util.LinkedList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        int[] nums = {4, 6, 5, 7, 7};
        Solution solution = new Solution();
        System.out.println(solution.findSubsequences(nums));
    }
}
class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        int i = 0;
        int flag = 0;
        List<List<Integer>> result = new LinkedList<>();
        while (i < nums.length - 1)
        {
            flag = i + 1;
            List<Integer> temp = new LinkedList<>();
            temp.add(nums[i]);
            for (int j = flag; j < nums.length; j++)
            {
                if (nums[j] >= temp.get(temp.size() - 1))
                {
                    temp.add(nums[j]);
                    if (!result.contains(temp))
                    {
                        result.add(temp);
                    }
                }
                if (j == nums.length - 1)
                {
                    flag++;
                }
            }
            i++;
        }
        return result;
    }
}
/*
class Solution {
    List<Integer> temp = new ArrayList<Integer>();
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        dfs(0, Integer.MIN_VALUE, nums);
        return result;
    }

    public void dfs(int current, int last, int[] nums) {
        if (current == nums.length) {
            if (temp.size() >= 2) {
                result.add(new ArrayList<Integer>(temp));
            }
            return;
        }
        if (nums[current] >= last) {
            temp.add(nums[current]);
            dfs(current + 1, nums[current], nums);
            temp.remove(temp.size() - 1);
        }
        if (nums[current] != last) {
            dfs(current + 1, last, nums);
        }
    }
}*/
