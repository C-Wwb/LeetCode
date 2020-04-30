import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution s = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of house: ");
        int number = input.nextInt();
        System.out.println("Please enter cash of each house: ");
        int[] nums = new int[number];
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }
        System.out.println(s.rob(nums));
    }
}
class Solution {
    public int rob(int[] nums) {
        int countOdd = 0;
        int countEven = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(i % 2 == 0)
            {
                countEven += nums[i];
                countEven = Math.max(countEven, countOdd);
            }
            if(i % 2 == 1)
            {
                countOdd += nums[i];
                countOdd = Math.max(countEven, countOdd);
            }
        }
        return Math.max(countEven, countOdd);
    }
}