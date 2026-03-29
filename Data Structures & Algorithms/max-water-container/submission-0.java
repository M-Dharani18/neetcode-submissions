class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1;
        int maxa=0;
        while(l<r){
            int res = Math.min(heights[l],heights[r])*(r-l);
            maxa=Math.max(maxa,res);
            if(heights[l]<heights[r]) { l+=1; }
            else r-=1;
        }
    return maxa;
    }
}
