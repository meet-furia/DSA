package arrays_and_arraylist.striver.practice1.medium;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] nums1 = {1,1,1};
        int res1 = subarraySum(nums1, 2);
        System.out.println(res1);
    }

    static public int subarraySum(int[] nums, int k) {
        int totalArrays = 0;
        int sum = 0;
        int right = 0;
        int left = 0;

        while (right < nums.length) {
            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }
            if (sum == k) {
                totalArrays += 1;
                right++;
            }
            else {
                sum += nums[right];
                right++;
            }
        }
        return totalArrays;

    }

    static public int subarraySumChatGPT(int[] nums, int k) {
        int totalArrays = 0;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                totalArrays++;
            }
        }

        // If the entire array sums to k, add 1 to totalArrays
        if (sum == k) {
            totalArrays++;
        }

        return totalArrays;    }

}
