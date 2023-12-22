package arrays.beginner.day5_count_number_of_occurrences;

import java.util.HashMap;
import java.util.Map;

public class NoOfOccurrences {
    public static void main(String[] args) {
        // Given an integer array a and value v, find the
        // number of occurrences of v in a
        int[] a = {1, 2, 2, 2, 2, 3, 4, 4, 6, 7, 7, 7, 8};
        int v = 2;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : a) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        System.out.println(map.get(v));
    }
}
