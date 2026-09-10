public class TrappedRainWater {
    public static int trappedWater(int height[]){
        int n = height.length;
        //claculate left max
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        //calculate right max
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        //loop
        int tapped = 0;
        for(int i =0;i<height.length;i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            tapped += waterlevel - height[i];
        }
        return tapped;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }
}
