import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int a = input.nextInt();
        System.out.println("Please enter another number: ");
        int b = input.nextInt();
        System.out.println(solution.maximum(a, b));
    }
}
class Solution {
    public int maximum(int a, int b) {
        int[] result = new int[2];
        result[0] = a;
        result[1] = b;
        return Arrays.stream(result).max().getAsInt();
    }
}
