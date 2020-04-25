import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("The number of array: ");
        int n = input.nextInt();
        System.out.println("Please enter array of numbers: ");
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextInt();
        }
        System.out.println("Please enter the key: ");
        int key = input.nextInt();
        Solution s = new Solution();
        System.out.println(s.search(numbers, key));
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;//最低位index
        int high = nums.length - 1;//最高位index
        while(high >= low)
        {
            int mid = (low + high) / 2;//中间数的index
            if(target < nums[mid])
                high = mid - 1;//把范围逐次减半
            else if(target == nums[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }
}
