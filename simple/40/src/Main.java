import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array: ");
        int size = input.nextInt();
        System.out.println("Please enter the array: ");
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Please enter the k: ");
        int k = input.nextInt();
        System.out.println(Arrays.toString(solution.getLeastNumbers(arr, k)));
    }

}
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int[] result = new int[k];
        System.arraycopy(arr, 0, result, 0, k);
        return result;
    }
}