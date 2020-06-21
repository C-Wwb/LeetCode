import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the half size of array: ");
        int n = input.nextInt();
        System.out.println("Please enter the array: ");
        int[] nums = new int[2 * n];
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(solution.shuffle(nums, n)));
    }
}
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i = 0;
        int j = n;
        int[] result = new int[nums.length];
        int index = 0;
        //List<Integer> list = new LinkedList<>();
        while (i < n && j < nums.length && index < nums.length)
        {
            //list.add(nums[i]);
            //list.add(nums[j]);
            result[index] += nums[i];
            index++;
            result[index] += nums[j];
            index++;
            i++;
            j++;
        }
        return result;
    }
}
/*
text
3
2 5 1 3 4 7
 */