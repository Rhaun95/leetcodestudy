class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        int start = 0;
        List<List<Integer>> res = new ArrayList<>(Arrays.asList(Arrays.asList(1)));

        while (start < numRows - 1) {
            res.add(calculateRow(res.get(start)));
            start++;
        }
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
     * Time complexity : O(numRow)
         Like the pyramid, the number of row element increases with each step.
         The algorithm need a linear time.

     * Space complexity : O(numRow)
        The result list is composed of sublist that correspond to the input.
        The algorithm takes also linear space as well.
     */

}