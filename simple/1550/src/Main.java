public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        //int[] arr = {2, 6, 4, 1};
        //int[] arr = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        int[] arr = {1, 1, 1};
        System.out.println(solution.threeConsecutiveOdds(arr));
    }
}
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int e : arr)
        {
            if (e % 2 != 0)
            {
                count++;
            }
            else
            {
                count = 0;
            }
            if (count == 3)
            {
                return true;
            }
        }
        return false;
    }
}