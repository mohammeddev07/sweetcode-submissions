class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        s_arr = [0] * 26
        t_arr = [0] * 26

        for i in s:
            s_arr[ord('z') - ord(i)] +=1 
        for i in t:
            t_arr[ord('z') - ord(i)] += 1

        if s_arr == t_arr:
            return True
        return False