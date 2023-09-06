package arrays_and_arraylist.striver.practice1.easy;

public class SingleElementInASortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,1,3,3,4,4,8,8,9};
        int res1 = singleNonDuplicate1(nums1);
        System.out.println(res1);

        int[] nums2 = {0,1,1,3,3,4,4,8,8};
        int res2 = singleNonDuplicate1(nums2);
        System.out.println(res2);

    }
    static public int singleNonDuplicate(int[] nums) {
        int s = 0, e = nums.length;
        while (s <= e) {
            int m = s + (e - s)/2;
            if (m < nums.length - 1 && nums[m] == nums[m + 1]) {
                if (m % 2 == 0) {
                    s = m + 1;
                }
                else {
                    e = m - 1;
                }
            }
            else if (m > 0 && nums[m] == nums[m - 1]) {
                if (m % 2 != 0) {
                    s = m + 1;
                }
                else  {
                    e = m - 1;
                }
            }
            else {
                return m;
            }
        }
        return -1;
    }

    static public int singleNonDuplicate1(int[] nums) {
        int s = 0, e = nums.length - 1;
        while (s < e) {
            int m = s + (e - s)/2;
            if (m % 2 != 0) {
                m--;
            }
            if (nums[m] == nums[m + 1]) {
                s = m + 2;
            }
            else {
                e = m;
            }
        }
        return nums[s];

    }
}
