class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // what we need to find

            // if already seen, return indices
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // store current number
            map.put(nums[i], i);
        }

        return new int[]{-1, -1}; // fallback (shouldn't happen in valid cases)
    }
}
