import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        int[] sorted = new int[nums.length];
        int i = nums.length - 1;

        while (start <= end) {
            if (Math.abs(nums[start]) >= Math.abs(nums[end])) {
                sorted[i] = nums[start] * nums[start];
                start++;
            }
            else {
                sorted[i] = nums[end] * nums[end];
                end--;
            }

            i--;
        } 

        return sorted;
    }
}