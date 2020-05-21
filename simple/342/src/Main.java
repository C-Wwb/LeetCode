import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = input.nextInt();
        System.out.println(solution.isPowerOfFour(num));
    }
}
class Solution {
    public boolean isPowerOfFour(int num) {
        double n = Math.log(num) / Math.log(4);
        return Math.round(n) == n;
    }
}