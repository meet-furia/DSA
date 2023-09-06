package arrays_and_arraylist.striver.practice1.easy;

public class MaxConsecutive1s {
    public static void main(String[] args) {
        int[] nums1 = {1,1,1,1,0,1,1,1};
        int max1s1 = findMaxConsecutiveOnes(nums1);
        System.out.println(max1s1);

        int[] nums2 = {0};
        int max1s2 = findMaxConsecutiveOnes(nums2);
        System.out.println(max1s2);

    }
    static public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int recordKeeper = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)  {
                recordKeeper+=1;
            }
            else {
                if (recordKeeper > maxOnes) {
                    maxOnes = recordKeeper;
                }
                recordKeeper = 0;
            }
        }
        if (recordKeeper > maxOnes) {
            return recordKeeper;
        }
        return maxOnes;
    }

}
