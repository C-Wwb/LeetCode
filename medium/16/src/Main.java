import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        System.out.println("Please enter the array:");
        int[] nums = new int[size];
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }
        System.out.println("Please enter the target: ");
        int target = input.nextInt();
        System.out.println(solution.threeSumClosest(nums, target));
    }
}
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int stone = 0;//固定下标
        int start = 1;//固定下标右侧的起始下标
        int end = 2;//起始下标右侧的结束下标
        int sum = nums[stone] + nums[start] + nums[end];//每一次三个数的和
        int current = 0;
        while (stone < nums.length - 3)
        {
            current = 0;
            if(start == nums.length - 2 && end == nums.length - 1)
            {
                stone++;
                start = stone + 1;
                end = stone + 2;
            }
            else if(end == nums.length - 1)
            {
                start++;
                end = start + 1;
            }
            else
            {
                end++;
            }
            current = nums[stone] + nums[start] + nums[end];
            if(Math.abs(current - target) < Math.abs(sum - target))
            {
                sum = current;
            }
        }
        return sum;
    }
}
/*
text
-1 2 1 -4
1
 */