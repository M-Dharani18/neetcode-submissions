class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int[] arr = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->mp.get(b)-mp.get(a));
        for(int key:mp.keySet()){
            pq.offer(key);
        }
        for(int i=0;i<k;i++){
           arr[i]= pq.poll();
        }
        return arr;
    }
}
