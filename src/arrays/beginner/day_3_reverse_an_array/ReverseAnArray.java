package arrays.beginner.day_3_reverse_an_array;

public class ReverseAnArray {
    // Reverse the values in a given array
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] rev = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            rev[i] = a[a.length-1-i];
        }

        // printing values from reversed array
        for (int v : rev) {
            System.out.print(v + " ");
        }
    }
}