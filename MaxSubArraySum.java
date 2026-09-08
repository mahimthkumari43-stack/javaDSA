public class MaxSubArraySum {
    public static int maxSubArraySum(int num[]){
        int maxSum = Integer.MIN_VALUE;
        int currsum = 0;
        
        for(int i =0;i<num.length;i++){
            int start = i;
            for(int j = i;j<num.length;j++){
                int end = j;
                currsum = 0;
                for(int k = start;k<=end;k++){
                    currsum += num[k];
                }
                if(currsum > maxSum){
                    maxSum = currsum;
                } 

                
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int numbers[] = {2,6,7,8,9};
        System.out.println(maxSubArraySum(numbers));
        
    }
}
