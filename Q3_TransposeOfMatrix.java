public class Q3_TransposeOfMatrix {
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mat[i][j] = matrix[j][i];
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] trans = transpose(matrix);
        for(int i=0; i<trans.length; i++){
            for(int j=0; j<trans[i].length; j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
