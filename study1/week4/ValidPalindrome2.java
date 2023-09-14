class Solution {
    public boolean validPalindrome(String s) {
        int end = s.length() - 1;

        for(int i = 0; i < s.length()/2 ; i++){
            if (s.charAt(i) == s.charAt(end)) {
                end--;
                continue;
            } else {
                return isPalindrome(s, i+1, end) || isPalindrome(s, i, end-1);
            }
        }
        return true;
    }

    public boolean isPalindrome(String s, int start, int end){

        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
    /**
     N : the length of the word

     T : O(N)
        check if the word match directly : O(n/2)
        if not, check without one character : O(n/2)

     S : O(N)
        end : O(1)
     */
}