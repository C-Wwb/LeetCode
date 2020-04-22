import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] nums = {2, 7, 11, 15};
        System.out.println("Please enter the target: ");
        int target = input.nextInt();
        Solution s = new Solution();
        System.out.println("The index is: ");
        System.out.println(Arrays.toString(s.twoSum(nums, target)));
    }

}
class Solution {
    public int[] twoSum(int[] nums, int target)
    {
        int[] targetIndex = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    targetIndex[0] = i;
                    targetIndex[1] = j;
                }
            }
        }
        return targetIndex;
    }
}