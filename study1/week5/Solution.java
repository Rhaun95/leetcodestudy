class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int totalAlice = 0;
        for (int candies : aliceSizes)
            totalAlice += candies;

        int totalBob = 0;
        Set<Integer> bobNumbers = new HashSet<>();
        for (int candies : bobSizes) {
            totalBob += candies;
            bobNumbers.add(candies);
        }
        int[] res = new int[2];
        int diff = (totalBob - totalAlice) / 2;

        for (int aliceSize : aliceSizes) {
            int bobSize = aliceSize + diff;
            if (bobNumbers.contains(bobSize)) {
                res[0] = aliceSize;
                res[1] = bobSize;
                return res;
            }
        }

        return res;
    }

    /**
     * n: aliceSizes.length
     * m: bobSizes.length
     *
     * T : O(n)
        calculate each sum of candies = O(m+n)
        find the bobSize to exchange = O(n)

     * S : O(m)
       In the case, bob has distinct number of candies in each box
     * /
}