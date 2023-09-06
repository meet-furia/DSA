package arrays_and_arraylist.striver.practice1.easy;

import java.util.*;

public class UnionAndIntersectionOfSortedArrays {
    public static void main(String[] args) {
        int[] nums1 ={6,6,7,8,9};
        int[] nums2 = {1,2,3,4,5,6};
        List list = unionOptimal(nums1, nums2);
        System.out.println(list);

        int[] unionArray = intersectionOfArrays(nums1, nums2);
        System.out.println(Arrays.toString(unionArray));


        int[] nums3 ={1,2,2,1};
        int[] nums4 = {2,2};
        int[] unionArray1 = intersectionOfArrays(nums3, nums4);
        System.out.println(Arrays.toString(unionArray1));

    }

    static public List<Integer> unionBrute(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0 ; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0 ; i < nums2.length; i++) {
            set.add(nums2[i]);
        }

        List<Integer> list = new ArrayList();
        for (int i : set) {
            list.add(i);
        }
        return list;
    }

    static public List<Integer> unionOptimal(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        List<Integer> intersectedList = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                if (intersectedList.contains(nums1[i])) {
                    i++;
                }
                else {
                    intersectedList.add(nums1[i]);
                    i++;
                }
            }
            else {
                if (intersectedList.contains(nums2[j])) {
                    j++;
                }
                else {
                    intersectedList.add(nums2[j]);
                    j++;
                }
            }
        }
        if (i == nums1.length - 1) {
            while (j < nums2.length) {
                if (intersectedList.contains(nums2[j])) {
                    j++;
                }
                else {
                    intersectedList.add(nums2[j]);
                    j++;
                }
            }
        }
        if (j == nums2.length - 1) {
            while (j < nums2.length) {
                if (intersectedList.contains(nums1[i])) {
                    i++;
                }
                else {
                    intersectedList.add(nums1[i]);
                    i++;
                }
            }
        }
        return intersectedList;
    }


    static int[] intersectionOfArrays(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (Integer n : nums1) set1.add(n);
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (Integer n : nums2) set2.add(n);

        set1.retainAll(set2);

        int [] output = new int[set1.size()];
        int idx = 0;
        for (int s : set1) output[idx++] = s;
        return output;
    }
}
