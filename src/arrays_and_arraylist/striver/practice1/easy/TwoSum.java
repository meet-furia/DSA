package arrays_and_arraylist.striver.practice1.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums1 = {9,5,2,15,7};
        int[] res1 = twoSumBruteForce(nums1, 9);
        System.out.println(Arrays.toString(res1));

        System.out.println(Arrays.toString(twoSumOptimal(nums1, 9)));
    }

    static public int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
            if (j == i) {
                continue;
            }
            else {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
            }
        }
        return new int[]{-1,-1};
    }

    static int[] twoSumOptimal(int[] nums, int target) {
        HashMap map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{(int) map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
