package sort_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {
        ArrayList<Integer> bubbleSort = new ArrayList<>(Arrays.asList(5,3,1,2,4));
        bubbleSort(bubbleSort);
    }

    public static List<Integer> bubbleSort( List<Integer> unsorted) {
        // Vai borbulhando os maiores ate o final e a borbulha vai baixando.
        // se nao borbulhar, ta tudo alinhado.
        int n = unsorted.size();
        for(int i = n - 1; i >= 0; i--) {

            boolean swapped = false;
            for (int k = 0; k < i; k++){

                if (unsorted.get(k) > unsorted.get(k+1)) {
                    int temp = unsorted.get(k);
                    unsorted.set(k, unsorted.get(k+1));
                    unsorted.set(k+1, temp);
                    System.out.println(unsorted);
                    swapped = true;
                }
            }
            if (!swapped) return unsorted;
        }
        return unsorted;

    }
}
