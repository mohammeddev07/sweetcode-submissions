class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int i = 0;
        while(i < nums.length){
            int sum = target - nums[i];
            if(map.containsKey(sum)) return new int[] {map.get(sum), i};
            map.put(nums[i], i);
            i++;
        }
        return new int[]{};
    }
}
