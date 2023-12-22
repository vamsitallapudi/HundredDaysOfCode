package arrays.beginner.day_3_reverse_an_array;

public class ReverseAnArrayOptimised {
    // using inplace reversal
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int n = a.length;
        for (int i = 0; i < n/2; i++) {
            //swap numbers from ith and (n-1-i)th position
            int temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }
        for (int v: a) {
            System.out.print(v + " ");
        }
    }
}
