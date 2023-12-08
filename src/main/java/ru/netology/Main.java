package ru.netology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> filteredArray = new ArrayList<>();
        for(Integer in : intList) {
            if (in > 0 && in % 2 == 0) {
                filteredArray.add(in);
            }
        }
        filteredArray.sort(Integer::compareTo);
        System.out.println(filteredArray);
    }
}