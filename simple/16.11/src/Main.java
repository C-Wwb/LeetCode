import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter shorter: ");
        int shorter = input.nextInt();
        System.out.println("Please enter longer: ");
        int longer = input.nextInt();
        System.out.println("Please enter k: ");
        int k = input.nextInt();
        System.out.println(Arrays.toString(solution.divingBoard(shorter, longer, k)));
    }
}
class Solution {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0)
        {
            return new int[0];
        }
        if (shorter == longer)
        {
            return new int[]{shorter * k};
        }
        int[] result = new int[k + 1];
        int i = 0;
        while(i <= k)
        {
            result[i] = (k - i) * shorter + i * longer;
            i++;
        }
        return result;
    }
}