class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            mp.put(nums[i],rem);
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==mp.get(nums[i])) return new int[]{i,j};
            }
        }
        return new int[]{0,0};
    }
}
