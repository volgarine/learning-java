/*In Java, a matrix is a two-dimensional array that consists of rows and columns.
        It is a convenient data structure for representing and manipulating multidimensional data.
        Each element in the matrix is accessed by its row and column index.*/
public class ArrayMatrix {
    public static void main(String[] args) {
        // Define a 3x3 matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing elements of the matrix
        int element = matrix[1][2]; // accessing the element at row 1, column 2 (value: 6)

        // Displaying the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // move to the next row
        }
        System.out.println("-----------------------------");
        // Loop Through a Multi-Dimensional Array
        // We can also use a for loop inside another for loop to get the elements of a two-dimensional array (we still have to point to the two indexes):
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }

    }
}
