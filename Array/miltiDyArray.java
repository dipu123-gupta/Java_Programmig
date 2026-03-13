public class miltiDyArray {
    public static void main(String[] args) {
        // multi dimensional array is an array of arrays
        // syntax -> int[][] arrayName = new int[rows][cols];
        int[][] arrayName = new int[3][3];
        arrayName[0][0] = 101;
        arrayName[0][1] = 102;
        arrayName[0][2] = 103;

        arrayName[1][0] = 104;
        arrayName[1][1] = 105;
        arrayName[1][2] = 106;

        arrayName[2][0] = 107;
        arrayName[2][1] = 108;
        arrayName[2][2] = 109;
        // print multi dimensional array using for loop
        for (int i = 0; i < arrayName.length; i++) {
            for (int j = 0; j < arrayName[i].length; j++) {
                // System.out.print(arrayName[i][j] + " ");
            }
            System.out.println();
        }

        // multi dimensional array --> each with diff length int[][] arrayName = new
        // int[3][];

        int[][] marks = new int[3][];
        marks[0] = new int[3];
        marks[1] = new int[2];
        marks[2] = new int[4];

        // assign value row wise
        marks[0][0] = 10;
        marks[0][1] = 20;
        marks[0][2] = 30;

        marks[1][0] = 40;
        marks[1][1] = 50;

        marks[2][0] = 60;
        marks[2][1] = 70;
        marks[2][2] = 80;
        marks[2][3] = 90;

        /*
         * [10] [20] [30]
         * [40] [50]
         * [60] [70] [80] [90]
         */

        // print multi dimensional array using for loop
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                // System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
