package sort_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    public static void main (String[] args) {
        List<Integer> mylist = new ArrayList<>(Arrays.asList(99,20,37,1,3,2,1));

        sort(mylist);

    }

    public static List<Integer> sort(List<Integer> unsorted) {
        for (int i =0; i < unsorted.size(); i++){
            int min = 10000000;
            int minIdx = 0;
            for (int k=i; k < unsorted.size(); k++){
                int current = unsorted.get(k);
                if (current < min){
                   min = current;
                   minIdx = k;

                }
            }
            int replaced = unsorted.get(i);
            unsorted.set(i,min);
            unsorted.set(minIdx,replaced);
            System.out.println(unsorted);

        }
        System.out.println(unsorted);
        return unsorted;

    }

}
