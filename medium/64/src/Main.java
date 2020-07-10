import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter n: ");
        int n = input.nextInt();
        System.out.println(solution.sumNums(n));
    }
}
class Solution {
    public int sumNums(int n) {
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }
}