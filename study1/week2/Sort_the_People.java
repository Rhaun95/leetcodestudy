class Sort_the_People {

    HashMap<Integer, String> list = new HashMap<>();

    public String[] sortPeople(String[] names, int[] heights) {

        int length = heights.length;
        String[] res = new String[length]; // Space Complexity = O(n), n is the length of the input array

        for (int i = 0; i < length; i++) { // Time Complexity = O(n)
            list.put(heights[i], names[i]);
        }

        Arrays.sort(heights); // Time Complexity = O(n log n)

        int j = 0;

        for (int i = length - 1; i >= 0; i--) {
            res[j] = list.get(heights[i]);
            j++;
        }
        return res;

    }
}