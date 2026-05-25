class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = 0;

        int max_diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            int diff = 0;
            
            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];
                diff = Math.abs(total - target);

                if (diff < max_diff) {
                    max_diff = diff;
                    result = total;
                }
                if (total == target) {
                    return total;
                }
                else if (total < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return result;
    }
}