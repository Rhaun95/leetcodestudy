class LongestSubsequences {
    public int[] answerQueries(int[] nums, int[] queries) {
        int[] res = new int[queries.length];
        Arrays.sort(nums);

        int sum = 0;
        int size = 0;
        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum <= queries[i]) {
                    size++;
                } else {
                    break;
                }
            }
            res[i] = size;
            size = 0;
            sum = 0;
        }

        return res;
    }

    /**
     * n : size of nums
     * m : size of queries
     *
     * T : O(n*m)
        in the case, sum of all elements in nums is less or equal than all numbers in queries

     * S : O(m)
     * can create all the numbers in the queries using the numbers in nums
         res : O(m)
     */
}