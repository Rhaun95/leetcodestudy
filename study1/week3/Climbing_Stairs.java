class Solution {
    //dp
    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        int first = 3;
        int second = 2;
        int count = 4;
        int res = 0;

        while(count <= n){
            res = first + second;
            second = first;
            first = res;
            count++;
        }
        return res;

    }
    /*
    T : O(N)
        iterate till n step is reached

    S : O(1)
        dp stores n elements. Each elements has the number of distinct ways to climb up n steps
    */

}