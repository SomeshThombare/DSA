public class RainwaterTrapping {
    // Time complexity - O(n) 
    public static int trappedRainwater(int height[]){
        //calculate left max boundary - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i =1; i < height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);

        }
        int n = height.length;
        //calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+ 1]);
        }

        // loop
        int trappeedwater = 0;
        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
        
        // trappedwater = waterLevel - height[i]
        trappeedwater += waterLevel - height[i];

        }
        return trappeedwater;
    }
    public static void main(String args[]){
        int height[] = {4,2,3,0,5,6,7};
        // trappedRainwater(height);
        System.out.println(trappedRainwater(height));
    }
}

