import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution s = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        System.out.println("Please enter the array: ");
        int[] nums = new int[size];
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }
        System.out.println(s.missingNumber(nums));
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length == 1)
        {
            if(nums[0] == 0)
            {
                return 1;
            }
            else
            {
                return nums[0] - 1;
            }
        }
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] + 1 != nums[i + 1])
            {
                return nums[i] + 1;
            }
        }
        if(nums[0] == 0)
        {
            return nums[nums.length - 1] + 1;
        }
        else
        {
            return 0;
        }
    }
}
