package arrays_and_arraylist.striver.practice1.easy;

import java.util.Arrays;

public class MoveAllZeroesToTheEnd {
    public static void main(String[] args) {
        int[] nums1 = {1,0,3,9,0,0,5,0,0};
        moveAllZeroesToTheEndWithoutOrder(nums1);
        System.out.println(Arrays.toString(nums1));
    }
    static public void moveAllZeroesToTheEndWithoutOrder(int[] nums) {
        int endPointer = nums.length - 1;
        int i = 0;

        while (i < nums.length) {
            if (i >= endPointer) {
                break;
            }
            if (nums[i] == 0) {
                if (nums[endPointer] == 0) {
                    endPointer--;
                }
                else {
                    int temp = nums[i];
                    nums[i] = nums[endPointer];
                    nums[endPointer] = temp;
                    endPointer--;
                }
            }
            else {
                i++;
            }
        }
    }

    static public void moveAllZeroesToTheEndWithOrder(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            return;
        }

        for (int i = j+1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }

}
