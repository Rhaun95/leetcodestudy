class LongestPalindrome {

    public int longestPalindrome(String s) {
        int n = s.length();
        HashMap<Character, Integer> countChar = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            list.put(ch, list.getOrDefault(ch, 0) + 1);
        }

        int odd = 0;
        for (int value : list.values()) {
            if (value % 2 != 0 ){
                odd++;
            }
        }

        return odd > 0? n - odd + 1: n;
    }
    /**
     * Time complexity : O(n)
        each alphabet in the input is processed once in the algorithm

     * Space complexity : O(n)
        every character is stored with a numeric value in hashmap
     */
}