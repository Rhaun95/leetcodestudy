class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int area = 0;
                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[]{i, j});
                    grid[i][j] = 0; // mark the visited field as 0 to avoid dobble check

                    while (!queue.isEmpty()) {
                        int[] current = queue.poll();
                        int x = current[0];
                        int y = current[1];
                        area++;

                        // check 4 directions (up, down, left, right)
                        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
                        for (int[] dir : directions) {
                            int newX = x + dir[0];
                            int newY = y + dir[1];

                            if (newX >= 0 && newX < m &&
                                    newY >= 0 && newY < n &&
                                    grid[newX][newY] == 1) {
                                queue.offer(new int[]{newX, newY});
                                grid[newX][newY] = 0;
                            }
                        }
                    }
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }
    /**
     * N : column size
     * M : row size
     *
     * T : O(N*M)
        every field should be checked
     *
     * S : O(N*M)
        for the case that whole field is one island
     */
}