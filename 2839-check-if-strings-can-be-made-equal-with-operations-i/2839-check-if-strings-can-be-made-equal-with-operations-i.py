class Solution:
    def canBeEqual(self, s1: str, s2: str) -> bool:
        s1 = list(s1)
        s2 = list(s2)

        for i in range(len(s1)):
            for j in range(i+2, len(s2)):
                if s1[i] != s2[i] and j-i == 2:
                    s1[i], s1[j] = s1[j], s1[i]
        
        s1 = ''.join(s1)
        s2 = ''.join(s2)
        return s1 == s2
        