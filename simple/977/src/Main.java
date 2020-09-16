import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        //int[] A = {-4, -1, 0, 3, 10};
        int[] A = {-7, -3, 2, 3, 11};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.sortedSquares(A)));
    }
}
class Solution {
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++)
        {
            result[i] = (int) Math.pow(A[i], 2);
        }
        Arrays.sort(result);
        return result;
    }
}