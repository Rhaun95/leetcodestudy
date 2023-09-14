class Solution {

    public void rotate(int[][] matrix) {
        int size = matrix.length;
        int stored;
        int endIndex = size - 1;

        for (int i = 0; i < matrix.length/2; i++) {
            for (int j = i; j < endIndex-i ; j++) {
                stored = matrix[i][j];
                matrix[i][j] = matrix[endIndex-j][i];
                matrix[endIndex-j][i] = matrix[endIndex-i][endIndex-j];
                matrix[endIndex-i][endIndex-j] = matrix[j][endIndex -i];
                matrix[j][endIndex -i] = stored;

            }
        }
    }
    /**
     *
     * N : the lenght of the array
     *
     * T : O(N)
        it need totally n time to proceed the algorithm
        length/2 times for the range of the image
        length/2 times inwards into the image

     * S : O(1)
        size : O(1)
        stored : O(1)
        endIndex : O(1)
     */
}