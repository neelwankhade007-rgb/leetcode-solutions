class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSalary = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            int currentRowSum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                currentRowSum += accounts[i][j];
            }

            // maxSalary = Math.max(currentRowSum, maxSalary);
            if (currentRowSum > maxSalary)
                maxSalary = currentRowSum;

        }

        return maxSalary;       
    }
}