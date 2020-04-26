import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4};
        Solution s = new Solution();
        System.out.println(s.containsDuplicate(nums));
    }

}
class Solution {
    public boolean containsDuplicate(int[] nums)
    {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
/*
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] == nums[j])
                {
                    return true;
                }
            }
        }
        return false;*/