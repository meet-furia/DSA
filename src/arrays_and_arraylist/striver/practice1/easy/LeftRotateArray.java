package arrays_and_arraylist.striver.practice1.easy;

import java.util.Arrays;

    public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,4,6,7,8,10};
        leftRotateArray(arr1, 2);
        System.out.println(Arrays.toString(arr1));

        rotate(arr1, 4);
        System.out.println(Arrays.toString(arr1));
    }


    static void leftRotateArray(int[] nums, int k) {
        int timeRecord = 1;
        do {
            int first = nums[0];
            for (int i = 1; i < nums.length; i++) {
                nums[i - 1] = nums[i];
            }
            nums[nums.length - 1] = first;
            timeRecord++;
        }
        while (timeRecord <= k);
    }

        static public void rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n; // To handle cases where k is greater than n

            // Reverse the entire array
            reverse(nums, 0, n - 1);
            // Reverse the first 'k' elements
            reverse(nums, 0, k - 1);
            // Reverse the remaining 'n - k' elements
            reverse(nums, k, n - 1);
        }

        static public void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }


}
