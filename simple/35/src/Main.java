import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        System.out.println("Please enter the array: ");
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }
        System.out.println("Please enter the target: ");
        int target = input.nextInt();
        System.out.println(solution.searchInsert(nums, target));
    }
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        int current = target;
        if (target > nums[nums.length - 1])
        {
            return nums.length;
        }
        if (target < nums[0])
        {
            return 0;
        }
        while (current <= nums[nums.length - 1])
        {
            if (Arrays.binarySearch(nums, current) < 0)
            {
                current++;
            }
            else
            {
                return Arrays.binarySearch(nums, current);
            }
        }
        return 0;
    }
}