package arrays;

public class ArraysIntro {
    public static void main(String[] args) {
//        array initialization
        int[] a = new int[5]; // fixed length of 5

        //populate data into arrays
        for(int i = 0; i< a.length;i++) { // iterating from 0 because arrays start from index 0
            a[i] = i+1;
        }

        // iterating through arrays
        for(int i=0; i< a.length;i++) {
            System.out.println(a[i]);
        }
        for(int val : a) {
            System.out.println(val);
        }

        // retrieving particular elements
        System.out.println(a[2]); // will print index-2 element i.e., 3


        // 2D Arrays
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
