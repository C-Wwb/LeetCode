public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();
        System.out.println(solution.multiply("123", "456"));
    }
}
/*class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        if (num1.length() == 1 || num2.length() == 1)
        {
            return String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2));
        }
        int i = num2.length() - 1;
        String result = "";
        while (i >= 0)
        {
            String temp = fill0(singleMultiply(num1, num2.charAt(i)), num2.length() - 1 - i);
            result = addStrings(result, temp);
            i--;
        }
        return result;
    }
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuilder ans = new StringBuilder();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        ans.reverse();
        return ans.toString(); }
    public static String singleMultiply(String num1, char singleNum2)
    {
        int i = num1.length() - 1;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        while (i >= 0)
        {
            int multiply = ((singleNum2 - 48) * (num1.charAt(i) - 48));
            result.append((multiply + carry) % 10);
            carry = (multiply + carry) / 10;
            i--;
        }
        return String.valueOf(result.reverse());
    }
    public static String fill0(String s, int n)
    {
        if (n == 0)
        {
            return s;
        }
        StringBuilder sBuilder = new StringBuilder(s);
        while (n > 0)
        {
            sBuilder.append(0);
            n--;
        }
        s = sBuilder.toString();
        return s;
    }
}*/
class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        String ans = "0";
        int m = num1.length(), n = num2.length();
        for (int i = n - 1; i >= 0; i--) {
            StringBuilder curr = new StringBuilder();
            int add = 0;
            for (int j = n - 1; j > i; j--) {
                curr.append(0);
            }
            int y = num2.charAt(i) - '0';
            for (int j = m - 1; j >= 0; j--) {
                int x = num1.charAt(j) - '0';
                int product = x * y + add;
                curr.append(product % 10);
                add = product / 10;
            }
            if (add != 0) {
                curr.append(add % 10);
            }
            ans = addStrings(ans, curr.reverse().toString());
        }
        return ans;
    }

    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuilder ans = new StringBuilder();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        ans.reverse();
        return ans.toString();
    }
}