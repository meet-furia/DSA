package arrays_and_arraylist.upgrad.questions;

public class PartitionEvenAndOdd {
    public static void main(String[] args) {
        int[] nums = { 3, 6, 9, 2, 8, 5, 4, 7 };
        partitionOddEven(nums);

        System.out.println("Partitioned Array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

//        static int[] partitionEvenOdd(int[] arr) {
//        int index = 0;
//        int positiveIndex = 0;
//        while (index < arr.length) {
//            if ()
//        }
//    }

    static void partitionOddEven(int[] nums) {
        int left = 0; // Pointer for the beginning of the array
        int right = nums.length - 1; // Pointer for the end of the array

        while (left < right) {
            // Find the first even number from the left side
            while (left < right && nums[left] % 2 != 0) {
                left++;
            }

            // Find the first odd number from the right side
            while (left < right && nums[right] % 2 == 0) {
                right--;
            }

            if (left < right) {
                // Swap the even and odd numbers
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
    }

}
