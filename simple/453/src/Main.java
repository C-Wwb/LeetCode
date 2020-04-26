import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Solution s = new Solution();
        System.out.println("Please enter the size of nums: ");
        int size = input.nextInt();
        System.out.println("Please enter the nums: ");
        int[] nums = new int[size];
        for(int i = 0; i < size; i++)
        {
            nums[i] = input.nextInt();
        }
        System.out.println(s.minMoves(nums));
    }
}
class Solution {
    public int minMoves(int[] nums)
    {
        int count = 0;
        int min = nums[0];
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < min)
            {
                min = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++)
        {
            count += nums[i] - min;
        }
        return count;
    }
}