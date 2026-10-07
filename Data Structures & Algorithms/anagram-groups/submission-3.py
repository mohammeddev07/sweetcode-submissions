class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        result = defaultdict(list)
        for word in strs:
            freq = [0]*26

            for s in word:
                freq[ord('z') - ord(s)] += 1
            # Put this key in the result map and check if the key is present and if it is then insert it into a list

            key = tuple(freq)
            result[key].append(word)
        return list(result.values())
