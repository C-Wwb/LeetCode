import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of customs: ");
        int number = input.nextInt();
        System.out.println("Please enter each customs cash: ");
        int[] bills = new int[number];
        for(int i = 0; i < bills.length; i++)
        {
            bills[i] = input.nextInt();
        }
        Solution s = new Solution();
        System.out.println(s.lemonadeChange(bills));
    }
}
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            }
            if (bill == 10) {
                five--;
                ten++;
            }
            if (bill == 20) {
                if (ten > 0) {
                    five--;
                    ten--;
                } else {
                    five -= 3;
                }
            }
            if (five < 0) {
                return false;
            }
        }
        return true;
    }
}