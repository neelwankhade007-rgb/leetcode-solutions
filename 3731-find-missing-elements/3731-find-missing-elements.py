class Solution(object):
    def findMissingElements(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        num_set = set(nums)
        low, high = min(nums), max(nums)
        
        missing = []
        for x in range(low, high + 1):
            if x not in num_set:
                missing.append(x)
        
        return missing