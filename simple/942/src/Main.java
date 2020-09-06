import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.diStringMatch("DDI")));
    }
}
class Solution {
    public int[] diStringMatch(String S) {
        int[] result = new int[S.length() + 1];
        int N = S.length();
        int M = 0;
        for (int i = 0; i < S.length(); i++)
        {
            if (S.charAt(i) == 'D')
            {
                result[i] = N--;
            }
            else
            {
                result[i] = M++;
            }
        }
        result[S.length()] = N;
        return result;
    }
}