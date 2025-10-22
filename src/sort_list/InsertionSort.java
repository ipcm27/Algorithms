package sort_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class InsertionSort {

    public static List<Integer> sortList(List<Integer> unsortedList) {
        List<Integer> sortedList = new ArrayList<>();

        // "5 3 1 2 4"
        for(int i = 1; i < unsortedList.size(); i++) {
        int currentIdx = i;

        // Enquanto current for maior que 0 (nao a primeira iteracao)
        // pego o item da lista
        // Enquanto o atual for menor que o anterior
            // int atual = unsortedList.get(currentIdx);
            // int anterior = unsortedList.get(currentIdx -1);
        while (currentIdx > 0 && unsortedList.get(currentIdx) < unsortedList.get(currentIdx -1)) {
            // pega o atual temporario
            int temp = unsortedList.get(currentIdx);
            // se for menor seto esse item pra posicao do anterior
            unsortedList.set(currentIdx, unsortedList.get(currentIdx-1));
            unsortedList.set(currentIdx -1,temp);
            currentIdx--;
            // dai dimininuo
            // faco isso ate ser igual a yero
        }

        }

        return unsortedList;
    }

    public static List<Integer> sortListIgor(List<Integer> unsortedList) {
        for (int i = 0; i < unsortedList.size(); i ++) {
            int currentIdx = i;


            // "5 3 1 2 4"
            while (currentIdx > 0 && unsortedList.get(currentIdx) < unsortedList.get(currentIdx-1)){
                int save = unsortedList.get(currentIdx-1);
                unsortedList.set(currentIdx-1,unsortedList.get(currentIdx));
                unsortedList.set(currentIdx,save);
                currentIdx--;

            }
        }
        return unsortedList;
    }

    public static List<String> splitWords(String s) {
        return s.isEmpty() ? List.of() : Arrays.asList(s.split(" "));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> unsortedList = splitWords("5 3 1 2 4").stream().map(Integer::parseInt).collect(Collectors.toList());
        scanner.close();
        List<Integer> res = sortListIgor(unsortedList);
        System.out.println(res.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}