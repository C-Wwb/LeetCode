import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        System.out.println("Please enter the array: ");
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextInt();
        }
        System.out.println("Please enter the target: ");
        int target = input.nextInt();
        System.out.println(Arrays.toString(solution.twoSum(numbers, target)));
    }
}
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int[] result = new int[2];
        while (i < numbers.length && numbers[i] <= target)
        {
            for (int j = i + 1; j < numbers.length; j++)
            {
                if (numbers[i] + numbers[j] == target)
                {
                    result[0] = i + 1;
                    result[1] = j + 1;
                }
            }
            i++;
        }
        return result;
    }
}
/*
text
2 7 11 15
 */