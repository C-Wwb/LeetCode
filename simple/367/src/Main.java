import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = input.nextInt();
        System.out.println(solution.isPerfectSquare(num));
    }
}
class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num / 2 + 1;
        while(left <= right)
        {
            int mid = (left + right) / 2;
            if (Math.pow(mid, 2) == num)
            {
                return true;
            }
            else if (Math.pow(mid, 2) > num)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }
        return false;
    }
}