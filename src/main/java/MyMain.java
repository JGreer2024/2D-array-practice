public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        // YOUR CODE HERE
        int num = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (Math.abs(mat[row][col] % 2) == 1) {
                    num++;
                }
            }
        }
        return num;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        int largest = Integer.MIN_VALUE;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] > largest) {
                    largest = mat[row][col];
                }
            }
        }
        // YOUR CODE HERE

        return largest;
    }

    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {
        // YOUR CODE HERE
        for (int row = 0; row < mat.length; row++) {
            int firstval = mat[row][0];
            for (int col = 0; col < mat[0].length; col++) {
                if (col >= 0 && col < mat[0].length - 1) {
                    mat[row][col] = mat[row][col + 1];
                } else if (col == mat[0].length - 1) {
                    mat[row][col] = firstval;
                }
            }
        }
        return mat;
    }

    // Creates a 2D array of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        // YOUR CODE HERE
        int[][] array = new int[arraySize][arraySize];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                array[row][col] = row + col;
            }
        }
        return array;
    }


    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        // YOUR CODE HERE
        double total = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                total += mat[row][col];
            }
        }
            return (total/(mat.length * mat[0].length));
        }

        // Returns the median of the 2D array mat
        // Remember that the array is sorted!
        public static double median ( double[][] mat){
            // YOUR CODE HERE
            int total = mat.length * mat[0].length;
            if (mat.length % 2 != 0 && mat[0].length % 2 == 0) {
                return ((mat[mat.length / 2][mat[0].length/2 -1] + mat[mat.length /2][mat[0].length/2])/2);
            } else if (mat.length % 2 == 0) {
                return ((mat[(mat.length / 2)-1][mat[0].length - 1] + mat[mat.length / 2][0])/2);
            } else return mat[mat.length / 2][mat[0].length / 2];
        }


        // Returns the mode of the 2D array mat
        // Remember that the array is sorted!
        public static double mode ( double[][] mat){
            // YOUR CODE HERE
            double last_num = 0;
            int counter = 0;
            double num_track = 0;
            int countsecond = 0;
            double biggest = 0;
            for (int row = 0; row < mat.length; row++) {
                for (int col = 0; col < mat[0].length; col++) {
                    if (last_num == mat[row][col]){
                        num_track = mat[row][col];
                        countsecond++;
                    }
                    if (countsecond > counter){
                        biggest = num_track;
                        counter = countsecond;
                    } last_num = mat[row][col];
                }
            }

            return biggest;
        }


        public static void main (String[]args){
            // Write some code here to test your methods!
        }
    }