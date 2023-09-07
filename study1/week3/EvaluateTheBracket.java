
class Solution {
    HashMap<String, String> pairs = new HashMap<>();

    public String evaluate(String s, List<List<String>> knowledge) {

        for (List<String> pair : knowledge) { //convert pair list into hashmap
            pairs.put(pair.get(0), pair.get(1));
        }

        String res = "";
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                int j = i + 1;
                while (s.charAt(j) != ')') {
                    j += 1;
                }
                res += pairs.getOrDefault(s.substring(i+1, j), "?");
                i = j;
            } else{
                res += s.charAt(i);
            }
        }
        return res;
    }
    /*
        T : O(N), N is the length of the input
            store the keys and values in hashmap => O(n)
            the input is checked n times

        S : O(N), N is the number of list elements
            store the elements of knowledge
            'res' has one String data
     */
}