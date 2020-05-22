import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("The number of array: ");
        int n = input.nextInt();
        System.out.println("Please enter array of numbers: ");
        int[] nums = new int[n];
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }
        System.out.println("Please enter the key: ");
        int target = input.nextInt();
        System.out.println(solution.search(nums, target));
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}
