class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int rem=target-numbers[i];
            mp.put(numbers[i],rem);
            for(int j=i+1;j<numbers.length;j++){
                if(mp.get(numbers[i])==numbers[j]) return new int[]{i+1,j+1};
            }
        }
        return new int[]{0,0};
    }
}
