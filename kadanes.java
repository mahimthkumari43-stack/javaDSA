public class kadanes {
    public static void kadanesAlgo(int num[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<num.length;i++){
            currentSum += num[i];
            if(currentSum <0){
                currentSum =  0;
            }
            maxSum = Math.max(maxSum,currentSum);
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-1};
        kadanesAlgo(numbers);
        
        
    }
}
