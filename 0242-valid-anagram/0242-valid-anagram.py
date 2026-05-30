class Solution:
    def isAnagram(self, s: str, t: str) -> bool:    
        return dict(Counter(s)) == dict(Counter(t))