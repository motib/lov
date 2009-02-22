// Learning Object Array08
//    ragged arrays
public class Array08 {
    static int addElements(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                sum = sum + a[i][j];
        return sum;
    }

    public static void main(/*String[] args*/) {
        int[][] matrix = new int[3][];
        int[] row0 = {0, 1, 2};
        int[] row1 = {3, 4};
        int[] row2 = {5};
        matrix[0] = row0;
        matrix[1] = row1;
        matrix[2] = row2;
        int sum = addElements(matrix);
    }
}
