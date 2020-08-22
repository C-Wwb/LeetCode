import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(solution.fourSum(nums, target));
    }
}
/*class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        for (int i = 0; i < 100000000; i++)
        {
            List<Integer> temp = new ArrayList<>();
            int a = (int)(Math.random() * (nums.length));
            int b = (int)(Math.random() * (nums.length));
            int c = (int)(Math.random() * (nums.length));
            int d = (int)(Math.random() * (nums.length));
            if (a != b && a != c && a != d && b != c && b != d && c != d
                    && nums[a] + nums[b] + nums[c] + nums[d] == target)
            {
                if (!sum.contains(a + b + c + d))
                {
                    sum.add(a + b + c + d);
                }
                else
                {
                    continue;
                }
                temp.add(nums[a]);
                temp.add(nums[b]);
                temp.add(nums[c]);
                temp.add(nums[d]);
                if (!result.contains(temp))
                {
                    result.add(temp);
                }
            }
        }
        return result;
    }
}*/
/*class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++)
        {
            for (int j = i + 1; j < nums.length - 2; j++)
            {
                for (int m = j + 1; m < nums.length - 1; m++)
                {
                    for (int n = m + 1; n < nums.length; n++)
                    {
                        List<Integer> temp = new ArrayList<>();
                        if (nums[i] + nums[j] + nums[m] + nums[n] == target)
                        {
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[m]);
                            temp.add(nums[n]);
                            if (!result.contains(temp))
                            {
                                result.add(temp);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}*/
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length < 4) {
            return ans;
        }
        Arrays.sort(nums);
        if (target < nums[0] + nums[1] + nums[2] + nums[3]
                || target > nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3]
                + nums[nums.length - 4]) {
            return ans;
        }
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (target < nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3]) {
                break;
            }
            if (target > nums[i] + nums[nums.length - 1] + nums[nums.length - 2] + nums[nums.length - 3]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if (target < nums[i] + nums[j] + nums[j + 1] + nums[j + 2]) {
                    break;
                }
                if (target > nums[i] + nums[j] + nums[nums.length - 1] + nums[nums.length - 2]) {
                    continue;
                }
                int l = j + 1, r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        while (l < r && nums[l - 1] == nums[l]) {
                            l++;
                        }
                        r--;
                        while (l < r && nums[r + 1] == nums[r]) {
                            r--;
                        }
                    } else if (sum > target) {
                        r--;
                        while (l < r && nums[r + 1] == nums[r]) {
                            r--;
                        }
                    } else {
                        l++;
                        while (l < r && nums[l - 1] == nums[l]) {
                            l++;
                        }
                    }
                }
            }
        }
        return ans;
    }
}