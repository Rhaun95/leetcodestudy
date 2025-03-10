import java.util.Hashtable;
class SetMismatch {
    Hashtable<Integer, Boolean> checklist = new Hashtable<>(); // potentially Space Complexity O(n)
    int[] res = new int[2]; // Space Complexity O(1)

    public int[] findErrorNums(int[] nums) {
        int length = nums.length; // Space Complexity O(1)

        for (int num : nums) {  // Time Complexity O(length)
            if (checklist.containsKey(num)) {
                res[0] = num;
            }
            checklist.put(num, true);
        }

        for (int i = 1; i <= length; i++) { // Time Complexity O(length)
            if (!checklist.containsKey(i)) {
                res[1] = i;
                break;
            }
        }
        return res;
    }
}
