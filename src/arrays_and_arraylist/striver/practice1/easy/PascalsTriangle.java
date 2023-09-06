package arrays_and_arraylist.striver.practice1.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> outerList1 = generate(5);
        System.out.println(outerList1);
    }

    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listOfListOfInt= new ArrayList<>();
        for (int outerListIndex = 0; outerListIndex < numRows; outerListIndex++) {
            List<Integer> listOfInt = new ArrayList<>();
            for (int innerListIndex = 0; innerListIndex <= outerListIndex; innerListIndex++) {
                if (innerListIndex == 0 || innerListIndex == outerListIndex) {
                    listOfInt.add(1);
                }
                else {
                    listOfInt.add(listOfListOfInt.get(outerListIndex - 1).get(innerListIndex - 1) + listOfListOfInt.get(outerListIndex - 1).get(innerListIndex));
                }
            }
            listOfListOfInt.add(listOfInt);
        }
        return listOfListOfInt;
    }

}
