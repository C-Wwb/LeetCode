public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        //int[] arr = {3, 0, 1, 1, 9, 7};
        //System.out.println(solution.countGoodTriplets(arr, 7, 2, 3));
        int[] arr = {1, 1, 2, 2, 3};
        System.out.println(solution.countGoodTriplets(arr, 0, 0, 1));
    }
}
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int i = 0;
        int count = 0;
        while (i < arr.length - 2)
        {
            int j = i + 1;
            while (j < arr.length - 1)
            {
                for (int k = j + 1; k < arr.length; k++)
                {
                    if (Math.abs(arr[i] - arr[j]) <= a && Math.abs(arr[j] - arr[k]) <= b
                            && Math.abs(arr[i] - arr[k]) <= c)
                    {
                        count++;
                    }
                }
                j++;
            }
            i++;
        }
        return count;
    }
}