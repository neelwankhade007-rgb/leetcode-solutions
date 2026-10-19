class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = nums.length / 2;

        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            
            if (count > max) {
                return num;
            }
            
            map.put(num, count);
        }

        return -1;
    }
}