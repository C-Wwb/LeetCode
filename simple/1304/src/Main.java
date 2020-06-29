import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = input.nextInt();
        System.out.println(Arrays.toString(solution.sumZero(n)));
    }
}
class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int sum = 0;
        result[0] = 0;
        if(n == 2)
        {
            result[0] = -1;
            result[1] = 1;
            return result;
        }
        for(int i = 1; i < n - 1; i++)
        {
            result[i] += result[i - 1] + 1;
            sum += result[i];
        }
        result[n - 1] = - sum;
        return result;
    }
}