package arrays_and_arraylist.striver.practice1.easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums1 =  {3,0,1, 4, 5};
        int mN1 = missingNumber(nums1);
        System.out.println(mN1);

        System.out.println(missingNumberWithFormula(nums1));
    }

    static public int missingNumber(int[] nums) {
        applyCycleSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    static int[] applyCycleSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (i == correctIndex) {
                i++;
            }
            else {
                if (correctIndex >= nums.length) {
                    i++;
                }
                else {
                    int temp = nums[i];
                    nums[i] = nums[correctIndex];
                    nums[correctIndex] = temp;
                }
            }
        }
        return nums;
    }


    static public int missingNumberWithFormula(int[] nums) {
        int n = (nums.length);
        int sum = (n * (n + 1))/2;
        int numsSum = 0;
        for (int i = 0; i < nums.length; i++) {
            numsSum += nums[i];
        }
        return sum - numsSum;
    }

    }
