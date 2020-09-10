import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        Solution solution = new Solution();
        System.out.println(solution.combinationSum2(candidates, 8));
    }
}
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, 0, target, new Stack<Integer>(), 0);
        return result;
    }
    public void backtrack(int[] nums, int start, int target, Stack<Integer> temp, int sum)
    {//1 1 2 5 6 7 10
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = start; i < nums.length; i++)
        {//剪枝操作，保证父节点不重复
            if (hashSet.contains(nums[i]))
            {
                continue;
            }
            else
            {
                hashSet.add(nums[i]);
            }
            temp.push(nums[i]);
            sum += nums[i];

            if (sum == target)
            {
                result.add(new ArrayList<>(temp));
            }
            else if (sum < target)
            {
                backtrack(nums, i + 1, target, temp, sum);
            }
            temp.pop();
            sum -= nums[i];
        }
    }
}