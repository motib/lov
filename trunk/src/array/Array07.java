// Learning Object Array07
//    arrays of arrays
public class Array07 {
    public static void main(/*String[] args*/) {
        int[][] matrix = new int[2][2];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = i*matrix.length + j;
        int[] vector = matrix[1];
    }
}
