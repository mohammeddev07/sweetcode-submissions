class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<n-2; i++){
            if(nums[i] > 0) break; 
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1, right = n-1;
            while(left < right){
                List<Integer> list = new ArrayList<>();
                if(nums[i] + nums[left] + nums[right] == 0){
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right+1]) right--;
                } else if(nums[i] + nums[left] + nums[right] > 0){
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}
