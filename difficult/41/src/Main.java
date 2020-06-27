import java.util.Arrays;
import java.util.Scanner;

public class Main {
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
        System.out.println(solution.firstMissingPositive(nums));
    }
}
class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0){
            return 1;
        }
        Arrays.sort(nums);
        if(nums[0] > 1 || nums[nums.length - 1] < 0)
        {
            return 1;
        }
        int flag = 1;
        while(flag < nums.length + 1)
        {
            for(int i = 0; i < nums.length - 1 ; i++)
            {
                if(nums[i] < flag && nums[i + 1] > flag)
                {
                    return flag;
                }
            }
            flag++;
        }
        return nums[nums.length - 1] + 1;
    }
}