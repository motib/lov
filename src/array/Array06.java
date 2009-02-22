// Learning Object Array06
//     two-dimensional arrays
public class Array06 {
    static int addElements(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                sum = sum + a[i][j];
        return sum;
    }

    public static void main(/*String[] args*/) {
        int[][] matrix = new int[2][2];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = i*matrix.length + j;
        int sum = addElements(matrix);
    }
}
