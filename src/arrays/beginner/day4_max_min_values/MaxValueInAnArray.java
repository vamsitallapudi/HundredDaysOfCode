package arrays.beginner.day4_max_min_values;

public class MaxValueInAnArray {
    // print the maximum value present in an array
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int[] a = {-1, 2, -3, 4};

        for(int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
