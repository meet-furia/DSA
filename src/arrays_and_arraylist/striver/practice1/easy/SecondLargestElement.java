package arrays_and_arraylist.striver.practice1.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr1 = {5,9,71,45,78,24,27};
        List sL1 = secondLargestAndSecondSmallestElement(arr1);
        System.out.println(sL1);

        int[] arr2 = {97, 21, 34, 54};
        List sl2 = secondLargestAndSecondSmallestElement(arr2);
        System.out.println(sl2);
    }
    static List<Integer> secondLargestAndSecondSmallestElement(int[] arr) {
        int secondLargest = secondLargestElement(arr);
        int secondSmallest = secondSmallestElement(arr);
        List<Integer> list = new ArrayList<>();
        list.add(secondSmallest);
        list.add(secondLargest);
        return list;
    }

    static int secondLargestElement(int[] arr) {
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    static int secondSmallestElement(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

}
