class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> orginWords = new HashSet<>();
        Map<String,String> lowercaseMap = new HashMap<>();
        Map<String,String> vowelcaseMap = new HashMap<>();

        for (String word : wordlist) {
            orginWords.add(word);
            String lower = word.toLowerCase();
            lowercaseMap.putIfAbsent(lower, word);
            vowelcaseMap.putIfAbsent(getVowelCase(lower), word);
        }

        for (int i = 0; i < queries.length ;i++) {
            String word = queries[i];
            if (orginWords.contains(word)) {
                continue;
            }
            String lower = word.toLowerCase();
            if (lowercaseMap.containsKey(lower)) {
                queries[i] = lowercaseMap.get(lower);
                continue;
            }
            String vowelcase = getVowelCase(lower);
            if (vowelcaseMap.containsKey(vowelcase)) {
                queries[i] = vowelcaseMap.get(vowelcase);

            } else {
                queries[i] = "";
            }
        }

        return queries;
    }

    public String getVowelCase(String str){
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] =='a' || arr[i] =='e' || arr[i] == 'i' ||
                    arr[i] == 'o' || arr[i] == 'u') {
                arr[i] = '.';
            }
        }
        return String.valueOf(arr);
    }
    /**
     * number of the queries : n
       the length of longest string : k

    T: O(n * k)
        Parsing the queries[] : O(n)
        lowercase and vowelcase conversion for every String: 2*k = O(k)

    S: O(n * k)
        input : O(n∗k)
        set : O(n∗k)
        lowercaseMap and vowelcaseMap : 2*(n*k) = O(n∗k)

     */
}