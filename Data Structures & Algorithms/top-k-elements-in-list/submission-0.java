class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[n + 1];
        
        for(int i=0; i<n+1; i++){
            freq[i] = new ArrayList<>();
        }

        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        
        int[] result = new int[k];
        int index = 0;
        for(int i = n; i>=0 && index < k; i--){
            for(int j : freq[i]){
                result[index++] = j;
                if(index ==k){
                    return result;
                }
            }
        }
        return result;

    }
}
