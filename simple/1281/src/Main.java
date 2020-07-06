import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n = input.nextInt();
        System.out.println(solution.subtractProductAndSum(n));
    }
}
class Solution {
    public int subtractProductAndSum(int n) {
        String nString = String.valueOf(n);
        int sum = (nString.charAt(0) - 48);
        int multiply = (nString.charAt(0) - 48);
        for(int i = 1; i < nString.length(); i++)
        {
            sum += (nString.charAt(i) - 48);
            multiply *= (nString.charAt(i) - 48);
        }
        return multiply - sum;
    }
}