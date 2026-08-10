class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        lb = self.lowerbound(nums, target)
        ub = self.upperbound(nums, target)

        if lb == ub:
            # Not present
            return [-1, -1]
        else:
            # Present
            return [lb, ub - 1]

    def lowerbound(self, nums, target):
        n = len(nums)
        low = 0
        high = n - 1
        ans = n

        while low <= high:
            mid = (low + high) // 2

            if nums[mid] >= target:
                ans = mid
                high = mid - 1
            else:
                low = mid + 1
        return ans

    def upperbound(self, nums, target):
        n = len(nums)
        low = 0
        high = n - 1
        ans = n

        while low <= high:
            mid = (low + high) // 2

            if nums[mid] > target:
                ans = mid
                high = mid - 1
            else:
                low = mid + 1
        return ans
