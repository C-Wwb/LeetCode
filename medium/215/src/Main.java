import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of arrays: ");
        int size = input.nextInt();
        System.out.println("Please enter the arrays: ");
        int[] nums = new int[size];
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }
        System.out.println("Please enter the k: ");
        int k = input.nextInt();
        System.out.println(solution.findKthLargest(nums, k));
    }
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 1;
        int current = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--)
        {
            if(nums[i] <= current)
            {
                count++;
                if(count == k)
                {
                    return nums[i];
                }
            }
            current = nums[i];
        }
        return Arrays.stream(nums).max().getAsInt();
    }
}
/*
text
6
3 2 1 5 6 4
2

9
3 2 3 1 2 4 5 5 6
4
 */