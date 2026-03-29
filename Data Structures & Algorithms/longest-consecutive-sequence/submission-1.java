class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        List<Integer> li = new ArrayList<>();
        for(int i : nums) li.add(i);
        int maxc=Integer.MIN_VALUE;
        for(int j:nums){
            int c=0;
            if(!li.contains(j-1)) {
                int curr=j;
            while(li.contains(curr)) {
                c++;
                curr++;
            }
        }
        if(c>maxc) maxc=c;
    }
     return maxc;
    }
   
}
