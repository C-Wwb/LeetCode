import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of array1: ");
        int size1 = input.nextInt();
        System.out.println("Please enter the array1: ");
        int[] nums1 = new int[size1];
        for (int i = 0; i < nums1.length; i++)
        {
            nums1[i] = input.nextInt();
        }

        System.out.println("Please enter the size of array2: ");
        int size2 = input.nextInt();
        System.out.println("Please enter the array2: ");
        int[] nums2 = new int[size2];
        for (int i = 0; i < nums2.length; i++)
        {
            nums2[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(solution.intersect(nums1, nums2)));
    }
}
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0  ||  nums2.length == 0)
        {
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int e1 : nums1)
        {
            int count = map.getOrDefault(e1, 0) + 1;
            //如果map中有e，获取其对应的value+1，否则0+1
            map.put(e1, count);//将count作为e的value插入map
        }
        int[] insertArray = new int[nums1.length];
        int index = 0;
        for (int e2 : nums2)
        {
            int count = map.getOrDefault(e2, 0);
            if(count > 0)//如果map中有num2中的元素
            {
                insertArray[index++] = e2;//将该元素加入数组
                count--;//map中该元素的个数-1
                if(count > 0)
                {//若-1后count>0
                    map.put(e2, count);//更新map中该元素的数量
                }
                else
                {
                    map.remove(e2);//否则将该元素从map中移除
                }
            }
        }
        return Arrays.copyOfRange(insertArray, 0, index);
    }
}
/*
text
4 9 5 4 4
9 4 9 8 4 6
 */