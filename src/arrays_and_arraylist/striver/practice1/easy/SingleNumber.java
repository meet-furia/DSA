package arrays_and_arraylist.striver.practice1.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2,1,2};
        System.out.println(singleNumber(nums1));


        System.out.println(xorMethod(nums1));

        System.out.println(2 ^ 2);
        System.out.println(0 ^ 2);
        System.out.println(2 ^ 0);
    }

    static public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        return getKeyByValue(map, 1);
    }

    static public <K, V> K getKeyByValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null; // Value not found in the map
    }


    static public int xorMethod(int[] nums) {
        int xor = 0;
        for (int n : nums) {
            xor = xor ^ n;
        }
        return xor;
    }

}
