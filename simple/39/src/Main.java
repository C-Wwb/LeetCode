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
        System.out.println(solution.majorityElement(nums));
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int n = nums[0];
        for(int num : nums){
            if(cnt == 0) n = num;
            cnt += n == num ? 1 : -1;
        }
        return n;
    }
}
/*
text
9
1 2 3 2 2 2 5 4 2
 */