import java.lang.Math;

class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> charList = new HashMap<>();
        int res = 0;
        int tmpSize = 0;

        for (int cur = 0; cur < s.length(); cur++) {

            if (charList.containsKey(s.charAt(cur))) {
                res = Math.max(tmpSize, res);
                tmpSize = 0;
                cur = charList.get(s.charAt(cur));
                charList.clear();
            } else {
                charList.put(s.charAt(cur), cur);
                tmpSize++;
            }
        }

        return Math.max(tmpSize, res);
    }

    /**
     * N : size of input String
     *
     * T : O(N)
        the algorithm traverse the input String once

     * S : O(N)
        the hashmap stores distinct characters.
        In the worst case, the HashSet may contain all characters from the input string
     */
}