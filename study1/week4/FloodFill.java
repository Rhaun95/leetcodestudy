class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int rowEnd = image.length;
        int columnEnd = image[0].length;

        if(image[sr][sc] == color) {
            return image;
        }

        int value = image[sr][sc];
        image[sr][sc] = color;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr, sc});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                if (newX >= 0 && newX < rowEnd && newY >= 0 && newY < columnEnd &&
                        image[newX][newY] == value) {
                    queue.offer(new int[]{newX, newY});
                    image[newX][newY] = color;
                }
            }
        }
        return image;
    }

    /**
     * N : number of rows
     * M : number of column
     *
     * T : O(N*M)
        every field should be visited

     * S : O(N*M)
        for the case that all of fields are stored in the queue
     */
}