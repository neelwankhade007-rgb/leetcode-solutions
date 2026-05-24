class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = n - 1;
            int sum = -1 * nums[i];

            while (left < right) {
                int s = nums[left] + nums[right];
                
                if (s == sum) {
                    res.add(Arrays.asList(
                        nums[i],
                        nums[left],
                        nums[right]
                    ));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                
                    while (right > left && nums[right] == nums[right + 1])
                        right--;
                }
                
                else if (s < sum)
                    left++;

                else if (s > sum)
                    right--;
            }    
        }

        return res;
    }
}