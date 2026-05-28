class Solution {
    public void sortColors(int[] nums) {
        int[] zero = new int[nums.length];
        int[] one = new int[nums.length];
        int[] two = new int[nums.length];
        int z = 0;
        int o = 0;
        int t = 0;

        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] == 0) {
                zero[z] = nums[i];
                z++;
            }

            else if (nums[i] == 1) {
                one[o] = nums[i];
                o++;
            }

            else {
                two[t] = nums[i];
                t++;
            }
        }

        int k = 0;

        for (int i = 0; i < z; i++) {
            nums[k] = zero[i];
            k++;
        }

        for (int i = 0; i < o; i++) {
            nums[k] = one[i];
            k++;
        }

        for (int i = 0; i < t; i++) {
            nums[k] = two[i];
            k++;
        }
    }
}