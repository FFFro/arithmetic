package leetcode;

/**
 * 字符串相加
 * @author : FFFro
 * @date : 2020-01-31 20:27
 **/
public class q90 {

    public static String addStrings(String num1, String num2) {
        int countLength = 0;
        boolean jin1 = false;
        StringBuilder sb = new StringBuilder();
        while (countLength < num1.length() && countLength < num2.length()) {
            int temp = (int) num1.charAt(num1.length() - 1 - countLength) + (int) num2.charAt(num2.length() - 1 - countLength) - 96;
            if (temp >= 10) {
                if (jin1) {
                    sb.append(temp % 10 + 1);
                } else {
                    sb.append(temp % 10);
                }

                jin1 = true;
            } else {
                if (jin1) {
                    temp = temp + 1;
                    if (temp == 10) {
                        sb.append(0);
                        jin1 = true;
                    } else {
                        sb.append(temp);
                        jin1 = false;
                    }
                } else {
                    sb.append(temp);
                    jin1 = false;
                }

            }

            countLength++;
        }

        if (countLength == num1.length() && countLength == num2.length()) {
            if (jin1) {
                sb.append(1);
            }
        } else if (countLength != num1.length()) {
            while (countLength != num1.length()) {
                int temp = (int) num1.charAt(num1.length() - 1 - countLength) - 48;
                if (jin1) {
                    temp = temp + 1;
                    if (temp >= 10) {
                        sb.append(0);
                        jin1 = true;
                    } else {
                        sb.append(temp);
                        jin1 = false;
                    }
                } else {
                    sb.append(temp);
                }

                countLength++;
            }

            if (jin1) {
                sb.append(1);
            }
        } else {
            while (countLength != num2.length()) {
                int temp = (int) num2.charAt(num2.length() - 1 - countLength) - 48;
                if (jin1) {
                    temp = temp + 1;
                    if (temp >= 10) {
                        sb.append(0);
                        jin1 = true;
                    } else {
                        sb.append(temp);
                        jin1 = false;
                    }
                } else {
                    sb.append(temp);
                }

                countLength++;
            }

            if (jin1) {
                sb.append(1);
            }
        }

        return sb.reverse().toString();
    }

    public String addStrings1(String num1, String num2) {
        StringBuilder res = new StringBuilder("");
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while(i >= 0 || j >= 0){
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int tmp = n1 + n2 + carry;
            carry = tmp / 10;
            res.append(tmp % 10);
            i--; j--;
        }
        if(carry == 1) res.append(1);
        return res.reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(addStrings("584", "18"));
    }
}

//给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
//
//        注意：
//
//        num1 和num2 的长度都小于 5100.
//        num1 和num2 都只包含数字 0-9.
//        num1 和num2 都不包含任何前导零。
//        你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
