package arrays_and_arraylist.striver.practice1.easy;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {
        int[] nums1 = {1,3,4,2,2};
        int dup1 = findDuplicate(nums1);
        System.out.println(dup1);


        int[] nums2 = {3,1,4,4,2};
        int dup2 = findDuplicate(nums2);
        System.out.println(dup2);

    }

    static public int findDuplicate(int[] nums) {
        applyCycleSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return nums[i];
            }
        }
        return -1;
    }

    static public void applyCycleSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] == nums[correctIndex]) {
                i++;
            }
            else {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }
    }

}
