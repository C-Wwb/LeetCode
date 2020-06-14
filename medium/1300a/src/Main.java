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
        System.out.println("Please enter the target: ");
        int target = input.nextInt();
        System.out.println(solution.findBestValue(arr, target));
    }
}
class Solution {
    public int findBestValue(int[] arr, int target) {
        int[] result = new int[arr.length];//记录每次替换后数组的和与target的差
        for(int i = 0; i < result.length; i++)
        {
            result[i] = Math.abs(target - replaceSum(arr, i));
        }
        int min = result[0];
        int minIndex = 0;
        for(int i = 0; i < result.length; i++)
        {
            if(result[i] < min)
            {
                min = result[i];
                minIndex = i;
            }
        }
        return arr[minIndex];
    }
    public static int replaceSum(int[] arr, int index)//求替换后数组的和
    {
        Arrays.sort(arr);
        int[] result;
        result = arr.clone();
        int value = arr[index];//index为替换起始下标
        Arrays.fill(result, index + 1, arr.length, value);
        return sum(result);
    }
    public static int sum(int[] arr)//数组求和
    {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
}