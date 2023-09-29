class FindMedianSortedArrays {
    /**

     데이터의 개수가 홀수라면 중앙값은 정렬된 결과의 가운데 수입니다
     데이터의 개수가 짝수라면 중앙값은 가운데 두 수의 평균입니다.

     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int size1 = nums1.length;
        int size2 = nums2.length;
        int totalSize = size1 + size2;

        int pos1 = 0;
        int pos2 = 0;
        int medianIndex = totalSize/2;
        int[] list = new int[medianIndex + 1];

        for (int i = 0; i < medianIndex + 1; i++) {

            if (pos1 < size1 && pos2 < size2) {
                if (nums1[pos1] < nums2[pos2]) {
                    list[i] = nums1[pos1];
                    pos1++;
                } else {
                    list[i] = nums2[pos2];
                    pos2++;
                }
            } else if (pos2 < size2) {
                list[i] = nums2[pos2];
                pos2++;

            } else if (pos1 < size1) {
                list[i] = nums1[pos1];
                pos1++;
            }
        }
        return totalSize % 2 == 0 ? (double)(list[medianIndex-1] + list[medianIndex])/2
                :  (double)list[medianIndex];
    }

    /**
     * k : (size1 + size2)/2 = index of median
     *
     * T : O(k)
        the algorithm will continue until two arrays are comapped k times.

     * S : O(k)
        k numbers from nums1 and nums2 are stored in the array for the return
     */
}
