public class PrefixSum {
    public static void prefix(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int prefixArray[] = new int[numbers.length];
        int currentSum = 0;
        prefixArray[0] = numbers[0];
        for(int i =1;i<numbers.length;i++){
            prefixArray[i] = prefixArray[i-1] + numbers[i];
        }

        for(int i = 0;i<numbers.length;i++){
            int start = i;
            for(int j =i;j<numbers.length;j++){
                int end = j;
                
                currentSum =start == 0?prefixArray[end]: prefixArray[end] - prefixArray[start-1];
            
            if(currentSum > maxSum){
            maxSum = currentSum;
            }
        }
        }
        System.out.println(maxSum);
        
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,-1,4,-5};
        prefix(numbers);
        
    }
}
