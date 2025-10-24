class Solution {
    public int trap(int[] height) {
     int w=0;
        int ml=0;
        int mr=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            if(height[l]<height[r]){
                if(height[l]>ml){
                    ml=height[l];
                }
                w+=ml-height[l++];
            }
            else{
                if(height[r]>mr){
                    mr=height[r];
                }
                w+=mr-height[r--];
            }
    }
    return w;   
    }
}