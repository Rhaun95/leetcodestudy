
 class Reverse_words_in_String_III {
     StringBuffer res = new StringBuffer();
     StringBuffer sb = new StringBuffer();
    public String reverseWords(String s) {

        for (String toReverse : s.split(" ")) { // linear time complexity O(n), n is the length of the input String
            sb.append(toReverse); // constant time complexity O(1)
            res.append(sb.reverse().append(" ")); // linear time complexity O(m)
            sb.setLength(0); // constant time complexity O(1)
        }
        res.setLength(res.length() - 1); // constant time complexity O(1)
        return res.toString(); // Space Complexity = O(n)
    }
// Time Complexity = O(n*m)
// Space Complexity = O(n)
}