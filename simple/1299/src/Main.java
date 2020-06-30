import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("The size of array: ");
        int size = input.nextInt();
        System.out.println("Please enter array: ");
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(solution.replaceElements(arr)));
    }
}
/*
class Solution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        while(index < arr.length - 1)
        {
            int[] current = Arrays.copyOfRange(arr, index + 1, arr.length);
            int max = Arrays.stream(current).max().getAsInt();
            result[index] = max;
            index++;
        }
        result[arr.length - 1] = -1;
        return result;
    }
}*/
class Solution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int max = -1;
        result[arr.length - 1] = -1;
        for(int i = arr.length - 2; i >= 0; i--)
        {
            if(arr[i + 1] > max)
            {
                max = arr[i + 1];
            }
            result[i] = max;
        }
        return result;
    }
}
/*
text
6
17 18 5 4 6 1
 */