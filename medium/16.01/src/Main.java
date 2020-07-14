import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the array: ");
        int[] numbers = new int[2];
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(solution.swapNumbers(numbers)));
    }
}
class Solution {
    public int[] swapNumbers(int[] numbers) {
        int[] result = new int[numbers.length];
        result[0] = numbers[1];
        result[1] = numbers[0];
        return result;
    }
}