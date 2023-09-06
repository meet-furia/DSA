package recursion.upgrad.questions;

public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNNumbers(5));

        System.out.println(sumOfNNumbersOtherMethod(5, 0));

        System.out.println(powerFunc(2, 3));

        System.out.println(powerFuncSecondMethod(2, 3, 2));

        printPattern(5);

        printPatternBySelf(5);
    }

    static int sumOfNNumbers(int num) {
        if (num == 0) {
            return num;
        }
        return num + sumOfNNumbers(num - 1);
    }

    static int sumOfNNumbersOtherMethod(int num, int sum) {
        if (num == 0) {
            return sum;
        }
        return sumOfNNumbersOtherMethod(num - 1, sum + num);
    }


    static int powerFunc(int base, int power) {
        if (power == 1) {
            return base;
        }
        return base * powerFunc(base, power - 1);
    }

    static int powerFuncSecondMethod(int base, int power, int realBase) {
        if (power == 1) {
            return base;
        }
        return powerFuncSecondMethod(base * realBase, power - 1, realBase);
    }

    static String printPattern(int num) {
        if (num <= 0) return "";

        String res = printPattern(num - 1);
        res = res + "*";
        System.out.println(res);

        return res;
    }

    static String printPatternBySelf(int num) {
        if (num == 0) {
            return "*";
        }
        String res = printPatternBySelf(num - 1);
        System.out.println(res);
        return res + "*";
    }


    public static boolean palindrome(int[] num, int index) {
        if (index == num.length/2) {
            return true;
        }

        else if (num[index] == num[num.length - 1 - index]) {
            return palindrome(num, index + 1);
        }

        else {
            return false;
        }
    }
}
