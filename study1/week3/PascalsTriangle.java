class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        int start = 0;
        List<List<Integer>> res = new ArrayList<>(Arrays.asList(Arrays.asList(1)));

        while (start < numRows - 1) {
            res.add(calculateRow(res.get(start)));
            start++;
        }
// feedback : using conventional for loop
//        for (int start = 0 ; start < numRows - 1 ; ++start) {
//            res.add(calculateRow(res.get(start)));
//        }
        return res;
    }

    /**
     * calculation each row
     * @param list
     * @return
     */
    public List<Integer> calculateRow(List<Integer> list){
        int size = list.size();
        List<Integer> tmp = new ArrayList<>();

        tmp.add(1);

        for (int i = 1; i < size; i++) {
            tmp.add(list.get(i - 1) + list.get(i));
        }

        tmp.add(1);

        return tmp;
    }

    /**
     * Time complexity : O(numRow^2)
         There are two nested for loops.

     * Space complexity : O(n^2)
        In res will be stored n(n+1)/2 numbers
     */



}