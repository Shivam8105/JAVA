public class graph {
    public static void main(String[] args) {
        String[] value = {"A","B","c","D"};

        int[][] matrix = {{0, 1, 1, 1},{1, 0, 1, 0},{1, 1, 0, 0},{1, 0, 0, 0}};

        print_matrix(matrix);

        print_connection(matrix, value);

    }

    public static void print_matrix(int[][] matrix){
        System.out.println("matrix: ");
        for(int[] row : matrix) {
            for(int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void print_connection(int[][] matrix, String[] value){
        for(int i = 0;i < value.length;i++) {
            System.out.print(value[i]+": ");
            for(int j = 0;j < value.length;j++) {
                if(matrix[i][j] == 1) {
                    System.out.print(value[j] + " ");
                }
            }
            System.out.println();
        }
    }
}