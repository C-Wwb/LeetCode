public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        String num1 = "635";
        String num2 = "5288";
        System.out.println(solution.addStrings(num1, num2));
    }
}
class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + carry;
            ans.append(result % 10);
            carry = result / 10;
            i--;
            j--;
        }
        return ans.reverse().toString();
    }
}
/*
635 + 5288 = 5923
 */