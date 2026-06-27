class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            int[] freq = new int[26];
            for(int j = 0; j<strs[i].length(); j++){
                freq[strs[i].charAt(j) - 'a']++;
            }
            String key = Arrays.toString(freq);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
