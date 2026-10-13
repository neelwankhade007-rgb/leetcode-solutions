class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxSalary = 0;

        for (int i = 0; i < accounts.length; i++) {
            int currentRowSum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                currentRowSum += accounts[i][j];
            }

            maxSalary = Math.max(currentRowSum, maxSalary);
        }

        return maxSalary;       
    }
}