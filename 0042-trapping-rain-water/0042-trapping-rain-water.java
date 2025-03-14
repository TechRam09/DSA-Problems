class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int width =1;
        if(n == 1 || n == 2){
            return 0;
        }
        // find max left boundaries
        int[] maxLeft = new int[n];
        //maxLeft first value will always be first element of height array
        maxLeft[0] = height[0];
        for(int i=1; i<n;i++){
            maxLeft[i] = Math.max(height[i],maxLeft[i-1]);
            //max(current bar height , previous max boundary)
        }
        
        // find max right boundaries
         int[] maxRight = new int[n];
         //maxLeft last value will always be last element of height array
        maxRight[n-1] = height[n-1];
        for(int i=n-2; i>=0;i--){// starting from last second value
            maxRight[i] = Math.max(height[i],maxRight[i+1]);
            //max(current bar height , next max boundary)
        }

        int trappedWater = 0;
        //Loop
        for(int i = 0;i<n;i++){
            // find water level
            int waterLevel = Math.min(maxLeft[i],maxRight[i]);
            //find trapped water
            trappedWater += (waterLevel - height[i]) * width;
        }
        
        return trappedWater;
        
    }
}