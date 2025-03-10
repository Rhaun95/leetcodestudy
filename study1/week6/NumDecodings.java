class NumDecodings {
    public int numDecodings(String s) {

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;

        for (int i = 2; i <= n; i++) {

            int first = Integer.valueOf(s.substring(i-1, i));
            int second = Integer.valueOf(s.substring(i-2, i));
            if  (first >= 1 && first <= 9){
                dp[i] += dp[i-1];
            }
            if  (second >= 10 && second <= 26) {
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }

    /**
     *
     * N : size of provided String
     * T(N)
     * each characters are visited once
     *
     * S(N)
     * in every step, the number of possible decoding way is stored in the array with same index
     *
     */
}