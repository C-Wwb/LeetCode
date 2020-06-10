import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = input.nextInt();
        System.out.println(solution.canWinNim(n));
    }
}
class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}