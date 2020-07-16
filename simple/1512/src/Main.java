import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        System.out.println("Please enter the array: ");
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = input.nextInt();
        }
        System.out.println(solution.numIdenticalPairs(nums));
    }
}
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int e : nums)
        {
            int count = map.getOrDefault(e, 0) + 1;
            map.put(e, count);
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            result += sum(entry.getValue() - 1);
        }
        return result;
    }
    public int sum(int number)
    {
        if (number < 1)
        {
            return 0;
        }
        return number + sum(number - 1);
    }
}