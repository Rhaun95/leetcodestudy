class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] isVisited = new boolean[n];

        dfs(0, isVisited, rooms);

        for (int i = 0; i < n; i++) {
            if (!isVisited[i]) {
                return false;
            }
        }
        return true;
    }

    public void dfs(int room, boolean[] isVisited, List<List<Integer>> rooms){
        isVisited[room] = true;
        for (int nextRoom : rooms.get(room)) {
            if (!isVisited[nextRoom]) {
                dfs(nextRoom, isVisited, rooms);
            }
        }
    }
    /**
     * n : number of the rooms
     * k : bigest number of keys

     T : O(n^n)
     lets assume there are all keys in each rooms
     iterate until all keys in each rooms are checked = O(n^n)
     check, wheather all rooms are visited = 0(n)

     S : O(n)
     n = O(1)
     isVisited = O(n)

     */
}