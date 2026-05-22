class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) { return 0; }
        
        int lo = 0;  // Pointer-1
        int res = 1;  // Initial unique
        int hi = 1;  // Pointer-2
        int n = nums.length;

        while (hi < n) {
            if (nums[hi] == nums[hi - 1]) {
                hi++;  // Skip if duplicate
            }

            // Put next unique value to lo + 1
            else {
                nums[lo + 1] = nums[hi];
                lo++;
                hi++;
                res++;  // Increment unique val counter
            }
        }

        return res;
    }
}