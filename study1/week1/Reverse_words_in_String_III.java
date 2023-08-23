<<<<<<< HEAD
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
=======
class Reverse words in String III {

    public String reverseWords(String s) {
        String res = "";                                // space complexity O(1)

        for(String a : s.split(" ")){                   // linear time complexity O(n), n is the length of the input String  
            StringBuffer sb = new StringBuffer(a);      // space complexity O(m), m is the length of a particular word
            String reverse = sb.reverse().toString();   // linear time complexity O(m)  
            res += reverse + " ";                       // constant time complexity O(1)
        }
        res = res.stripTrailing();                      // constant time complexity O(1)  
        return res;                                     // space complexity O(n)
    }
// Time Complexity = O(n*m)
// Space Complexity = O(n+m) = O(n)
}
>>>>>>> 2966d3d9f70c2aebbbef393606e21e5e75da8d06
