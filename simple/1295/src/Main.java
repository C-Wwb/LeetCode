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
        System.out.println(solution.findNumbers(nums));
    }
}
class Solution {
    public int findNumbers(int[] nums) {
        String[] array = new String[nums.length];
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            array[i] = String.valueOf(nums[i]);
            if(array[i].length() % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }
}
/*
text
12 345 2 6 7896
555 901 482 1771
 */