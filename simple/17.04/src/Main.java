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
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }
        System.out.println(solution.missingNumber(nums));
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int actualTotal = 0;
        int currentTotal = 0;
        for(int i = 0; i < nums.length; i++)
        {
            currentTotal += nums[i];
            actualTotal += i;
        }
        actualTotal += nums.length;
        return actualTotal - currentTotal;
    }
}