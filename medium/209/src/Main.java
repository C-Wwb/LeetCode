import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the target: ");
        int s = input.nextInt();
        System.out.println("Please enter the size of list: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        System.out.println("Please enter the array: ");
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }
        System.out.println(solution.minSubArrayLen(s, nums));
    }
}
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length == 0 || sum(nums) < s)
        {
            return 0;
        }
        if(Arrays.stream(nums).max().getAsInt() >= s)
        {
            return 1;
        }
        int i = 0;
        int j = 0;
        int sum = 0;
        int count = 100000;
        while(i < nums.length - 1 && j < nums.length - 1)
        {
            j++;
            sum += nums[j];
            if(sum + nums[i] >= s)
            {
                count = Math.min(count, j + 1 - i);
                i++;
                j = i;
                sum = 0;
            }
        }
        return count;
    }
    public static int sum(int[] nums)
    {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
/*
text
7
2 3 1 2 4 3
 */