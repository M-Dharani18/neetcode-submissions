class Solution {
    public int trap(int[] height) {
        int[] lmax = new int[height.length];
        int[] rmax = new int[height.length];

        int max=height[0];
        for(int i=0;i<lmax.length;i++){
            if(height[i]>max) max=height[i];
            lmax[i]=max;
        }
        max=height[lmax.length-1];
        for(int i=height.length-1;i>=0;i--){
            if(height[i]>max) max=height[i];
            rmax[i]=max;
        }
        int total=0;
        for(int i=0;i<height.length;i++){
            total+=Math.min(lmax[i],rmax[i])-height[i];
        }
        return total;
    }
}
