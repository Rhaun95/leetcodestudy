class Reduce_Array_Size {

    public int minSetSize(int[] arr){

        int size = arr.length, res = 0, n = arr.length; //initializing
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap= new PriorityQueue<>(
                (a, b)->{
                    return b.getValue()-a.getValue();
                }); //Max heap, to give priority to the high frequency element

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            maxHeap.offer(entry);

        while (size > n/2) {
            size -= maxHeap.poll().getValue(); //reducing the size
            res += 1; //counting the set size
        }
        return res; //returning the minimum size of the set
    }
    /**
     * T -> O(N log N)
        Max Heap uses an internal binary data structure by adding => in worst case log N
        There are N numbers to add.
     * S -> O(N)
        The distinct numbers of the input array are stored in the maxHeap
     */
}